package com.metro.apirest.domain.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Locality {

    @JsonProperty("name")
    String name;

    @JsonProperty("url_weather_forecast_15_days")
    String url_weather_forecast_15_days;

    @JsonProperty("url_hourly_forecast")
    String url_hourly_forecast;

    @JsonProperty("country")
    String country;

    @JsonProperty("url_country")
    String url_country;
}
