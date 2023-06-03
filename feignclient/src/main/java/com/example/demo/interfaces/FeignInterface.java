package com.example.demo.interfaces;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Product;


/*We give feignClient as annotation in the interface of feignclient
 * we give value as the name in the application.properties-------
 * url is the url of the other microservice where the connection and all the controller functions lies
 * so here product-service is the requestmapping of controller
 * 
 * We give RequestMapping for all the methods ,method should be specific,we give the value as the endpoint and produces as the
 * content it returns in body */
@FeignClient(value = "feignclient", url = "http://localhost:7081/product-service")
public interface FeignInterface {

	// add abstract wrapper methods to call the product api

	@RequestMapping(method = RequestMethod.GET, value = "/products")
	public List<Product> getProducts();

	@RequestMapping(method = RequestMethod.GET, value = "/products-by-id/{id}", produces = "application/json")
	public Product getProductsById(@PathVariable("id") int id);

	@RequestMapping(method = RequestMethod.GET, value = "/products-by-category/{category}", produces = "application/json")
	public List<Product> getProductsByCategory(@PathVariable("category") String category);

}
