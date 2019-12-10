package com.metro.apirest.domain.comuna;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {

    @JsonProperty("city")
	String city;

	@JsonProperty("interesting")
	Interesting interesting;

	@JsonProperty("var")
    Var var;

    public Location() {
	}
    
    public Location(String city, Interesting interesting, Var var) {
		this.city = city;
		this.interesting = interesting;
		this.var = var;		
	}

}
