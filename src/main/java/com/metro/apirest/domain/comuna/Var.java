package com.metro.apirest.domain.comuna;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Var {
	
	@JsonProperty("name")
	String name;

	@JsonProperty("icon")
	Integer icon;
	
	/* @JsonProperty("data")
	Data data; */

	@JsonProperty("data")
	List<Data> data = new ArrayList<>();
	
	public Var() {
	}

	public Var(String name, Integer icon, List<Data> data){
		this.name = name;
		this.icon = icon;
		this.data = data;		
	}
}
