package com.metro.apirest.domain.comuna;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Url {

    @JsonProperty("url")
    String url;

    @JsonProperty("description")
    String description;   

    public Url() {
        
    }
    
}
