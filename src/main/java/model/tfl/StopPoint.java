package model.tfl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StopPoint {

    private String naptanId;

    private String platformName;

    private String indicator;

    private String stopLetter;

    private List<String> modes;

    private String icsCode;

    private String smsCode;

    private String stopType;

    private String stationNaptan;

    private String accessibilitySummary;

    private String hubNaptanCode;

    private List<Identifier> lines;

    private List<LineGroup> lineGroup;

    private LineModeGroup lineModeGroup;

    private String fullName;

    private String naptanMode;

    private boolean status;

    private String id;

    private String url;

    private String commonName;

    private Number distance;

    private String placeType;

    private List<AdditionalProperties> additionalProperties;

    private List<Place> children;

    private List<String> childrenUrls;

    private Number lat;

    private Number lon;

    public String getNaptanId() {
        return naptanId;
    }

    public void setNaptanId(String naptanId) {
        this.naptanId = naptanId;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getIndicator() {
        return indicator;
    }

    public void setIndicator(String indicator) {
        this.indicator = indicator;
    }

    public String getStopLetter() {
        return stopLetter;
    }

    public void setStopLetter(String stopLetter) {
        this.stopLetter = stopLetter;
    }

    public List<String> getModes() {
        return modes;
    }

    public void setModes(List<String> modes) {
        this.modes = modes;
    }

    public String getIcsCode() {
        return icsCode;
    }

    public void setIcsCode(String icsCode) {
        this.icsCode = icsCode;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    public String getStopType() {
        return stopType;
    }

    public void setStopType(String stopType) {
        this.stopType = stopType;
    }

    public String getStationNaptan() {
        return stationNaptan;
    }

    public void setStationNaptan(String stationNaptan) {
        this.stationNaptan = stationNaptan;
    }

    public String getAccessibilitySummary() {
        return accessibilitySummary;
    }

    public void setAccessibilitySummary(String accessibilitySummary) {
        this.accessibilitySummary = accessibilitySummary;
    }

    public String getHubNaptanCode() {
        return hubNaptanCode;
    }

    public void setHubNaptanCode(String hubNaptanCode) {
        this.hubNaptanCode = hubNaptanCode;
    }

    public List<Identifier> getLines() {
        return lines;
    }

    public void setLines(List<Identifier> lines) {
        this.lines = lines;
    }

    public List<LineGroup> getLineGroup() {
        return lineGroup;
    }

    public void setLineGroup(List<LineGroup> lineGroup) {
        this.lineGroup = lineGroup;
    }

    public LineModeGroup getLineModeGroup() {
        return lineModeGroup;
    }

    public void setLineModeGroup(LineModeGroup lineModeGroup) {
        this.lineModeGroup = lineModeGroup;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNaptanMode() {
        return naptanMode;
    }

    public void setNaptanMode(String naptanMode) {
        this.naptanMode = naptanMode;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public Number getDistance() {
        return distance;
    }

    public void setDistance(Number distance) {
        this.distance = distance;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }

    public List<AdditionalProperties> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(List<AdditionalProperties> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public List<Place> getChildren() {
        return children;
    }

    public void setChildren(List<Place> children) {
        this.children = children;
    }

    public List<String> getChildrenUrls() {
        return childrenUrls;
    }

    public void setChildrenUrls(List<String> childrenUrls) {
        this.childrenUrls = childrenUrls;
    }

    public Number getLat() {
        return lat;
    }

    public void setLat(Number lat) {
        this.lat = lat;
    }

    public Number getLon() {
        return lon;
    }

    public void setLon(Number lon) {
        this.lon = lon;
    }
}
