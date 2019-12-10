package com.metro.apirest.domain.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Day1 {
    
    @JsonProperty("date")
    String date;

    @JsonProperty("temperature_max")
    String temperature_max;
    
    @JsonProperty("temperature_min")
    String temperature_min;

    @JsonProperty("icon")
    String icon;

    @JsonProperty("text")
    String text;

    @JsonProperty("humidity")
    String humidity;

    @JsonProperty("wind")
    String wind;

    @JsonProperty("wind_direction")
    String wind_direction;

    @JsonProperty("icon_wind")
    String icon_wind;

    @JsonProperty("sunrise")
    String sunrise;

    @JsonProperty("sunset")
    String sunset;

    @JsonProperty("moonrise")
    String moonrise;

    @JsonProperty("moonset")
    String moonset;

    @JsonProperty("moon_phases_icon")
    String moon_phases_icon;
}
