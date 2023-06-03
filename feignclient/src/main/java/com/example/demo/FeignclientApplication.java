package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableDiscoveryClient
@EnableFeignClients //searches for a interface which has a feign
@SpringBootApplication
/*We give EnableDiscoveryClient to have that connection with the database which is the registryservice
 * EnableFeignClient is used to show it is an feignclient
 * We give the same entity details of the Product*/
public class FeignclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignclientApplication.class, args);
	}

}
