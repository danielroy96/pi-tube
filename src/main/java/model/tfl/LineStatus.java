package model.tfl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LineStatus {

    private int id;

    private String lineId;

    private int statusSeverity;

    private String statusSeverityDescription;

    private String reason;

    private String created;

    private String modified;

    private List<ValidityPeriod> validityPeriods;

    private Disruption disruption;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public int getStatusSeverity() {
        return statusSeverity;
    }

    public void setStatusSeverity(int statusSeverity) {
        this.statusSeverity = statusSeverity;
    }

    public String getStatusSeverityDescription() {
        return statusSeverityDescription;
    }

    public void setStatusSeverityDescription(String statusSeverityDescription) {
        this.statusSeverityDescription = statusSeverityDescription;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public List<ValidityPeriod> getValidityPeriods() {
        return validityPeriods;
    }

    public void setValidityPeriods(List<ValidityPeriod> validityPeriods) {
        this.validityPeriods = validityPeriods;
    }

    public Disruption getDisruption() {
        return disruption;
    }

    public void setDisruption(Disruption disruption) {
        this.disruption = disruption;
    }
}
