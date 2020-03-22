package model.tfl;

public class TrainLoading {

    private String line;

    private String lineDirection;

    private String platformDirection;

    private String direction;

    private String naptanTo;

    private String timeSlice;

    private int value;

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public String getLineDirection() {
        return lineDirection;
    }

    public void setLineDirection(String lineDirection) {
        this.lineDirection = lineDirection;
    }

    public String getPlatformDirection() {
        return platformDirection;
    }

    public void setPlatformDirection(String platformDirection) {
        this.platformDirection = platformDirection;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getNaptanTo() {
        return naptanTo;
    }

    public void setNaptanTo(String naptanTo) {
        this.naptanTo = naptanTo;
    }

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
