package com.cts.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //it is as client the registryservice is as server
@SpringBootApplication
public class HelloserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloserviceApplication.class, args);
	}

}
