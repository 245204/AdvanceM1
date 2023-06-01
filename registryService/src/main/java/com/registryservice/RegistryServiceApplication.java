package com.registryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*this is the server
 * 1. we add the annotation @EnableEurekaServer 
 * In the application properties we add eureka.client.fetch-registry=false
 * server.port of registryservice is always 8761*/


@EnableEurekaServer
@SpringBootApplication
public class RegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryServiceApplication.class, args);
	}

}
