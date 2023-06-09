package com.cts.client.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/client")
public class HelloClientResource {

	@Autowired
	RestTemplate template; //there are many inbuilt methods so we use this to call..to communicate between two services like jparepository
	
	@GetMapping("he")
	public String callServer() {
		
		// for direct execution of server
		//String url="http://localhost:8093/bill/service/status";
		//String url="http://localhost:8094/rest/service/status";
		String url="http://localhost:8093/rest/service/status";
		//String url="http://localhost:8094/rest/service";
		String output=template.getForObject(url,String.class);//return type is called string.class response object
		//getforObject is basically used for getmapping
		return output;
		
	}
//2nd microservice running with the gateway
	@GetMapping("/bi")
	public String bill() {
		
		// for direct execution of server
		String url="http://localhost:8087/bill/service/status";
		//String url="http://localhost:8094/rest/service/status";
		//String url="http://localhost:8093/rest/service/status";
		//String url="http://localhost:8094/rest/service";
		String output=template.getForObject(url,String.class);//return type is called string.class response object
		//getforObject is basically used for getmapping
		return output;
		
	}
}
