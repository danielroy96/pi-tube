package model.tfl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Line {

    private String id;

    private String name;

    private String modeName;

    private List<Disruption> disruptions;

    private String created;

    private String modified;

    private List<LineStatus> lineStatuses;

    private List<MatchedRoute> routeSections;

    private List<LineServiceTypeInfo> serviceTypes;

    private Crowding crowding;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public List<Disruption> getDisruptions() {
        return disruptions;
    }

    public void setDisruptions(List<Disruption> disruptions) {
        this.disruptions = disruptions;
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

    public List<LineStatus> getLineStatuses() {
        return lineStatuses;
    }

    public void setLineStatuses(List<LineStatus> lineStatuses) {
        this.lineStatuses = lineStatuses;
    }

    public List<MatchedRoute> getRouteSections() {
        return routeSections;
    }

    public void setRouteSections(List<MatchedRoute> routeSections) {
        this.routeSections = routeSections;
    }

    public List<LineServiceTypeInfo> getServiceTypes() {
        return serviceTypes;
    }

    public void setServiceTypes(List<LineServiceTypeInfo> serviceTypes) {
        this.serviceTypes = serviceTypes;
    }

    public Crowding getCrowding() {
        return crowding;
    }

    public void setCrowding(Crowding crowding) {
        this.crowding = crowding;
    }
}
