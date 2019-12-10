package com.metro.apirest.domain.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Information {
    
    @JsonProperty("temperature")
    String temperature;

    @JsonProperty("wind")
    String wind;

    @JsonProperty("humidity")
    String humidity;

    @JsonProperty("pressure")
    String pressure;

}
