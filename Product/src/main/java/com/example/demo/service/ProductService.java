package com.example.demo.service;

import java.util.List;

import com.example.demo.resource.Product;

public interface ProductService {

		List<Product> findAll();
		List<Product> findByCategory(String category);
		Product findById(int id);
	}



