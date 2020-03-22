package model.tfl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Disruption {

    private String category;

    private String type;

    private String categoryDescription;

    private String description;

    private String summary;

    private String additionalInfo;

    private String created;

    private String lastUpdate;

    private List<RouteSection> affectedRoutes;

    private List<StopPoint> affectedStops;

    private String closuretext;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<RouteSection> getAffectedRoutes() {
        return affectedRoutes;
    }

    public void setAffectedRoutes(List<RouteSection> affectedRoutes) {
        this.affectedRoutes = affectedRoutes;
    }

    public List<StopPoint> getAffectedStops() {
        return affectedStops;
    }

    public void setAffectedStops(List<StopPoint> affectedStops) {
        this.affectedStops = affectedStops;
    }

    public String getClosuretext() {
        return closuretext;
    }

    public void setClosuretext(String closuretext) {
        this.closuretext = closuretext;
    }
}
