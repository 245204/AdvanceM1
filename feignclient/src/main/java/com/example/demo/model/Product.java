package com.example.demo.model;

//import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Product {
//	private long productId;
//	private String name;
//	private String description;
//	private int qty;
//	private BigDecimal price;
	Integer productId;
	String name;
	String category;
	String brand;
	double price;


}
