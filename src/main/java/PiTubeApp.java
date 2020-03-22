import com.pi4j.wiringpi.Gpio;
import com.pi4j.wiringpi.Lcd;
import model.tfl.Prediction;

import java.io.IOException;
import java.util.List;
import java.util.Queue;

public class PiTubeApp {

  public static void main(String[] args) throws IOException, InterruptedException {

    ApiPollingThread apiPollingThread = new ApiPollingThread();
    apiPollingThread.start();

    Gpio.wiringPiSetupGpio();

    int lcdHandle = Lcd.lcdInit(2, 16, 4, 26, 19, 13, 6, 5, 11, 0, 0, 0, 0);

    while (1==1) {

      List<Prediction> predictions = apiPollingThread.getPredictions();

      if(predictions.size() > 0) {
        LcdUtils.setRow(lcdHandle, 0, shortenDestinationStation(predictions.get(0).getTowards()), predictions.get(0).getTimeToStation());
        if (predictions.get(0).getTimeToStation() < 45) {
          TrainApproachSequenceThread trainApproachSequenceThread = new TrainApproachSequenceThread(lcdHandle, shortenDestinationStation(predictions.get(0).getTowards()));
          trainApproachSequenceThread.run();
        }
      }
      if(predictions.size() > 1) {
        LcdUtils.setRow(lcdHandle, 1, shortenDestinationStation(predictions.get(1).getTowards()), predictions.get(1).getTimeToStation());
      }

      Thread.sleep(30000);

    }

  }

  private static String shortenDestinationStation(String towards) {
    switch(towards) {
      case "Heathrow via T4 Loop":
        return "Heathrow T4";
      case "Check Front of Train":
        return "Check Train";
      default:
        return towards;
    }
  }

}
