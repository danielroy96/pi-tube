package model.tfl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Crowding {

    private List<PassengerFlow> passengerFlows;

    private List<TrainLoading> trainLoadings;

    public List<PassengerFlow> getPassengerFlows() {
        return passengerFlows;
    }

    public void setPassengerFlows(List<PassengerFlow> passengerFlows) {
        this.passengerFlows = passengerFlows;
    }

    public List<TrainLoading> getTrainLoadings() {
        return trainLoadings;
    }

    public void setTrainLoadings(List<TrainLoading> trainLoadings) {
        this.trainLoadings = trainLoadings;
    }
}
