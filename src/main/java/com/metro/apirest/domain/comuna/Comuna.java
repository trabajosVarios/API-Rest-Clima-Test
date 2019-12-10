package com.metro.apirest.domain.comuna;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Comuna {
	
	@JsonProperty("location")
	Location location;

	public Comuna() {
	}

	public Comuna(Location location) {
		this.location = location;
	}
}
