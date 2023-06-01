package com.example.demo.resource;

import org.springframework.http.ResponseEntity;

public class Product {
Integer productId;
String name;
String category;
String brand;
double price;


public Product() {
	// TODO Auto-generated constructor stub
}


public Product(Integer productId, String name, String category, String brand, double price) {
	super();
	this.productId = productId;
	this.name = name;
	this.category = category;
	this.brand = brand;
	this.price = price;
}


public Integer getProductId() {
	return productId;
}
public void setProductId(Integer productId) {
	this.productId = productId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}

//Optional<Student> op=repo.findById(id);
//if(op.isPresent) {
//	repo.deleteById(id);
//	return ResponseEntity.ok().build();
//}else {
//	return ResponseEntity.noContent().build();
//}
