package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.sbeans.Product;

@Component
public class ProductService {
	@Autowired
	Product product;
	public void finalPrice() {
		System.out.println("Final Price: "+(product.getPrice()-product.getDiscount()));
	}
}
