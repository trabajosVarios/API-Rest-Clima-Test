package com.metro.apirest.domain.comuna;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Report {

	private List<Interesting> interesting = new ArrayList<>();
	private List<Var> var = new ArrayList<>();

	public List<Interesting> getInteresting() {
		return interesting;
	}

	public void setInteresting(List<Interesting> interesting) {
		this.interesting = interesting;
	}

	public List<Var> getVar() {
		return var;
	}

	public void setVar(List<Var> var) {
		this.var = var;
	}

}
