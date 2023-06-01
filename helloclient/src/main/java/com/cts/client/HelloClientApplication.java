package com.cts.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@EnableEurekaClient // commented as client is before the gateway
//in the 2nd case where the client is a part of the microservice we use @EnableEurekaClient when we use as outside client with the
//help of gatway we remove that annotations
@SpringBootApplication
public class HelloClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloClientApplication.class, args);
	}
	
	@Bean //used as we are using rest template,when we use rest template we need to put bean
	public RestTemplate makeTemplate() {
		return new RestTemplate();
	}

}
