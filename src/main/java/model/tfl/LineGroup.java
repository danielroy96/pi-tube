package model.tfl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LineGroup {

    private String naptanIdReference;

    private String stationAtcoCode;

    private List<String> lineIdentifier;

    public String getNaptanIdReference() {
        return naptanIdReference;
    }

    public void setNaptanIdReference(String naptanIdReference) {
        this.naptanIdReference = naptanIdReference;
    }

    public String getStationAtcoCode() {
        return stationAtcoCode;
    }

    public void setStationAtcoCode(String stationAtcoCode) {
        this.stationAtcoCode = stationAtcoCode;
    }

    public List<String> getLineIdentifier() {
        return lineIdentifier;
    }

    public void setLineIdentifier(List<String> lineIdentifier) {
        this.lineIdentifier = lineIdentifier;
    }
}
