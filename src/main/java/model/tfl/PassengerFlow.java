package model.tfl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PassengerFlow {

    private String timeSlice;

    private int value;

    public String getTimeSlice() {
        return timeSlice;
    }

    public void setTimeSlice(String timeSlice) {
        this.timeSlice = timeSlice;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
