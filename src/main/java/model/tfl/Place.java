package model.tfl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Place {

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
