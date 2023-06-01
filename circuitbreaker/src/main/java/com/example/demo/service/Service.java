package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

public class Service {
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/test1")
	@CircuitBreaker(name = "test1service", fallbackMethod = "fallback")
	public String test() {

		return this.restTemplate.getForObject("http://localhost:8080/testing", String.class);

	}
	private String fallback(Throwable e) {
		 
	    System.out.println("Exception happened : " + e.getMessage());
	    return "Handled the exception through fallback method";
	}


}
