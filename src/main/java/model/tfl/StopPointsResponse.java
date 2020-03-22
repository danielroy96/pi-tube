package model.tfl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StopPointsResponse {

    private List<Number> centrePoint;

    private List<StopPoint> stopPoints;

    private int pageSize;

    private int total;

    private int page;

    public List<Number> getCentrePoint() {
        return centrePoint;
    }

    public void setCentrePoint(List<Number> centrePoint) {
        this.centrePoint = centrePoint;
    }

    public List<StopPoint> getStopPoints() {
        return stopPoints;
    }

    public void setStopPoints(List<StopPoint> stopPoints) {
        this.stopPoints = stopPoints;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
