package com.metro.apirest.domain.comuna;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {

    @JsonProperty("forecast")
    Forecast forecast;
    
    public Data() {
    }

    
    public Data(Forecast forecast){
        this.forecast = forecast;
    }


}
