package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Product {
	
	@Value("${product.productName}")
	private String productName;
	
	@Value("${product.price}")
	private double price;
	
	@Value("${product.discountPercentage}")
	private double discountPercentage;
	
	public String toString() {
		double finalPrice = price - (price * discountPercentage / 100);
		return "Product Details:\r\n"
				+ "Product name: "+this.productName+"\r\n"
				+ "Original price: "+this.price+"\r\n"
				+ "Discount percentage: "+this.discountPercentage+"\r\n"
				+ "Final discounted price: "+finalPrice+"";
	}}
