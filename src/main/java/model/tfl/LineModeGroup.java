package model.tfl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LineModeGroup {

    private String modeName;

    private List<String> lineIdentifier;

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public List<String> getLineIdentifier() {
        return lineIdentifier;
    }

    public void setLineIdentifier(List<String> lineIdentifier) {
        this.lineIdentifier = lineIdentifier;
    }
}
