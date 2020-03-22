package model.tfl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RouteSection {

    private String id;

    private String lineId;

    private String routeCode;

    private String name;

    private String lineString;

    private String direction;

    private String originationName;

    private String destinationName;

    private String validTo;

    private String validFrom;

    private RouteSectionNaptanEntrySequence routeSectionNaptanEntrySequence;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLineString() {
        return lineString;
    }

    public void setLineString(String lineString) {
        this.lineString = lineString;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getOriginationName() {
        return originationName;
    }

    public void setOriginationName(String originationName) {
        this.originationName = originationName;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public RouteSectionNaptanEntrySequence getRouteSectionNaptanEntrySequence() {
        return routeSectionNaptanEntrySequence;
    }

    public void setRouteSectionNaptanEntrySequence(RouteSectionNaptanEntrySequence routeSectionNaptanEntrySequence) {
        this.routeSectionNaptanEntrySequence = routeSectionNaptanEntrySequence;
    }
}
