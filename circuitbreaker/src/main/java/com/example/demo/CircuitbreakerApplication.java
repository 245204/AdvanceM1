package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@SpringBootApplication
public class CircuitbreakerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitbreakerApplication.class, args);
	}
	@Bean
	public RestTemplate makeTemplate() {
		return new RestTemplate();
	}


}
