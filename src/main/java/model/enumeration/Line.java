package model.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Arrays;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Line {

    BAKERLOO("bakerloo","Bakerloo", "#FFFFFF", "#AE6118"),
    CENTRAL("central", "Central", "#FFFFFF", "#E41F1F"),
    CIRCLE("circle" , "Circle", "#113892", "#F8D42D"),
    DISTRICT("district", "District", "#FFFFFF", "#007229"),
    DLR("dlr", "DLR", "#FFFFFF", "#00BBB4"),
    HAMMERSMITH_CITY("hammersmith-city", "Hammersmith & City", "#113892", "#E899A8"),
    JUBILEE("jubilee", "Jubilee", "#FFFFFF", "#686E72"),
    METROPOLITAN("metropolitan", "Metropolitan", "#FFFFFF", "#893267"),
    NORTHERN("northern" ,"Northern", "#FFFFFF", "#000000"),
    OVERGROUND("overground", "Overground", "#FFFFFF", "#F86F86"),
    PICADILLY("piccadilly", "Picadilly", "#FFFFFF", "#0450A1"),
    VICTORIA("victoria", "Victoria", "#FFFFFF", "#009FE0"),
    WATERLOO_CITY("waterloo-city", "Waterloo & City", "#113892", "#70C3CE");

    String id;

    String name;

    String foregroundColour;

    String backgroundColour;

    Line(String id, String name, String foregroundColour, String backgroundColor) {
        this.id = id;
        this.name = name;
        this.foregroundColour = foregroundColour;
        this.backgroundColour = backgroundColor;
    }

    @JsonCreator
    public static Line fromId(String id) {
        return Arrays.stream(values())
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getForegroundColour() {
        return foregroundColour;
    }

    public String getBackgroundColour() {
        return backgroundColour;
    }
}
