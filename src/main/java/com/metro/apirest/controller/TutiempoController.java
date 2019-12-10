package com.metro.apirest.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.metro.apirest.domain.json.TutiempoJson;


@RestController
@SpringBootApplication
@RequestMapping("/api/v1")
public class TutiempoController {
	
	private static final Logger log = LoggerFactory.getLogger(TutiempoJson.class);
	
	@Value("${endpointjson}")
	String endpointjson;

	@Autowired
	RestTemplate restTemplate;
	
	
	@GetMapping(path = "/tutiempo-json", produces = { "application/json", "text/json" }, consumes = MediaType.ALL_VALUE)
	public TutiempoJson getJson() throws IOException {
		
		final TutiempoJson responseBody = restTemplate.getForObject(endpointjson, TutiempoJson.class);
		log.info("Datos entregados :::: " + responseBody);
		return responseBody;
	}
}
