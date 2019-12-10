package com.metro.apirest.domain.comuna;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Interesting {
	
	@JsonProperty("url")
	String url;

	public Interesting() {		
	}

}
