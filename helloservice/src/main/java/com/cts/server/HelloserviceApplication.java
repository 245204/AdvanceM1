package com.cts.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/*it is acting as a client the registryservice is as server
 * So we add the annotation as @EnableEurekaClient to show this is a client
 * In application properties we spring.application.name=helloservice
 * eureka:client:register-with-eureka: true to give the registration with the service 
 * service-url:defaultZone: http://localhost:8761/eureka   we should give this to get the link for the server*/


@EnableEurekaClient 
@SpringBootApplication
public class HelloserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloserviceApplication.class, args);
	}

}
