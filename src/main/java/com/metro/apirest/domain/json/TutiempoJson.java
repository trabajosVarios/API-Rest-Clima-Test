package com.metro.apirest.domain.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TutiempoJson {
	
	@JsonProperty("copyright")
	String copyright;	
	
	@JsonProperty("use")
	String use;
	
	@JsonProperty("information")
	Information information;
	
	@JsonProperty("web")
	String web;
	
	@JsonProperty("language")
	String language;
	
	@JsonProperty("locality")
	Locality locality;
	
	@JsonProperty("day1")
	Day1 day1;

	public TutiempoJson(){		
	}

	public TutiempoJson(String copyright, String use, Information information, String web, String language, Locality locality, Day1 day1){
		this.copyright = copyright;
		this.use = use;
		this.information = information;
		this.web = web;
		this.language = language;
		this.locality = locality;
		this.day1 = day1;		
	}

}
