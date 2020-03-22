import io.restassured.RestAssured;
import model.tfl.Prediction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ApiPollingThread extends Thread {

  private List<Prediction> predictionsForPlatform = new ArrayList<>();

  public void run() {

    // TFL API keys
    String appId = System.getenv("TFL_APP_ID");
    String appKey = System.getenv("TFL_APP_KEY");

    while (1==1) {

      List<Prediction> predictions = Arrays.asList(
          RestAssured
              .get("https://api.tfl.gov.uk/StopPoint/940GZZLUWLO/arrivals?app_id=" + appId + "app_key=" + appKey)
              .getBody()
              .as(Prediction[].class)
      );

      predictionsForPlatform = predictions
          .stream()
          .filter(prediction -> prediction.getPlatformName().equals("Southbound - Platform 2"))
          .sorted(Comparator.comparingInt(Prediction::getTimeToStation))
          .collect(Collectors.toList());

      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    }

  }

  public List<Prediction> getPredictions() {
    return this.predictionsForPlatform;
  }
}
