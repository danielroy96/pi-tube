package model.tfl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Mode {

    private boolean isTflService;

    private boolean isFarePaying;

    private boolean isScheduledService;

    private String modeName;

    public boolean isTflService() {
        return isTflService;
    }

    public void setTflService(boolean tflService) {
        isTflService = tflService;
    }

    public boolean isFarePaying() {
        return isFarePaying;
    }

    public void setFarePaying(boolean farePaying) {
        isFarePaying = farePaying;
    }

    public boolean isScheduledService() {
        return isScheduledService;
    }

    public void setScheduledService(boolean scheduledService) {
        isScheduledService = scheduledService;
    }

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }
}
