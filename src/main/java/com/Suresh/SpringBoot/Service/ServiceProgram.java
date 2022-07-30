package com.Suresh.SpringBoot.Service;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Suresh.SpringBoot.Models.Flight;
import com.Suresh.SpringBoot.Models.Flights;

@Service
public class ServiceProgram {

	public void getUnitedFlights() {
		RestTemplate template = new RestTemplate();
		ResponseEntity<Flights> forEntity = template
				.getForEntity("http://mu.mulesoft-training.com/essentials/united/flights", Flights.class);
		Flights body = forEntity.getBody();
		List<Flight> flights = body.getFlights();
		flights.forEach(System.out::println);
	}

	// passing http headers using the rest template
	public void getHeaders() {
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("accept", "application/json");
		HttpEntity entity = new HttpEntity<>(headers);
		
		RestTemplate template = new RestTemplate();
		Flights forObject = template.getForObject("http://mu.mulesoft-training.com/essentials/united/flights", Flights.class);
		System.out.println(forObject);
	}
}
