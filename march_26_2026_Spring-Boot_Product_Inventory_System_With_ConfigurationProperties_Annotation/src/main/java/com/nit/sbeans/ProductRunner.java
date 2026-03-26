package com.nit.sbeans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProductRunner implements CommandLineRunner {
	@Autowired
	Product product;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Product Details:");
		IO.println("Product Id: " + product.getId());
		IO.println("Product Name: " + product.getName());
		IO.println("Product Price: " + product.getPrice());

		// Array
		System.out.println("\nFeatures: ");
		for (String features : product.getFeatures()) {
			IO.println(features);
		}

		// List
		System.out.println("\nCategories: ");
		for (String categories : product.getCategories()) {
			IO.println(categories);
		}

		// Set
		System.out.println("\nTags: ");
		for (String tags : product.getTags()) {
			IO.println(tags);
		}

		// Map
		System.out.println("\nStock: ");
		for (Map.Entry<String, Integer> entry : product.getStock().entrySet()) {
			IO.println("Warehouse Name: " + entry.getKey());
			IO.println("Quantity: " + entry.getValue());
		}

		// Address Object
		System.out.println("\nSupplier: ");
		IO.println("Supplier Name: " + product.getSupplier().getName());
		IO.println("Supplier location: " + product.getSupplier().getLocation());
		IO.println("Supplier contact: " + product.getSupplier().getContact());

	}

}
