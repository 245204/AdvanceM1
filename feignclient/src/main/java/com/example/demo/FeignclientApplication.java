package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients //searches for a interface which has a feign
@SpringBootApplication
public class FeignclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignclientApplication.class, args);
	}

}
