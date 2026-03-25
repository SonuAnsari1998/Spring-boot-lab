package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Value("${product.name}")
	private String name;

	@Value("${product.price}")
	private double price;

	@Value("${product.discount}")
	private double discount;
}
