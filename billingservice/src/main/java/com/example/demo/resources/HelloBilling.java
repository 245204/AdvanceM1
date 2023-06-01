package com.example.demo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bill/service")
public class HelloBilling {
	
	@GetMapping("/status")
	public String status() {
		return "from bill service";
	}

}
