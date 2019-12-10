package com.metro.apirest.controller;

import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.metro.apirest.domain.comuna.Comuna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@SpringBootApplication
@RequestMapping("/api/v1")
public class ComunaController {

	private static final Logger log = LoggerFactory.getLogger(Comuna.class);

	@Value("${endpoint}")
	String endpoint;
	
	@Autowired
	RestTemplate restTemplate;

	@GetMapping(path = "/comuna-objeto", produces = { "application/json", "text/json" }, consumes = MediaType.ALL_VALUE)
	public String getForObject() throws IOException {
		
		HttpHeaders headers = new HttpHeaders();
		XmlMapper xmlMapper = new XmlMapper();
		ObjectMapper objectMapper = new ObjectMapper();
		
		headers.setAccept(Arrays.asList(MediaType.ALL));
		HttpEntity <String> entity = new HttpEntity<String>(headers);
		
		String dataExterna = restTemplate.exchange(endpoint, HttpMethod.GET, entity, String.class).getBody();
					
		JsonNode node = xmlMapper.readTree(dataExterna.getBytes());
		log.info("Datos de JsonNode :: " + node);		
		String json = objectMapper.writeValueAsString(node);

		return json;
	}
	
	@GetMapping("/comuna-entidad")
	public Comuna getForEntity() throws IOException {

		// final ResponseEntity<Comuna> responseEntity = restTemplate.getForEntity(endpoint, Comuna.class);
		final Comuna responseBody = restTemplate.getForObject(endpoint, Comuna.class);
		log.info("Datos de Salida del Entity :: " + responseBody);

		return responseBody;
	}

	
}
