package com.nit.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "product")
public class Product {
	private int id;
	private String name;
	private double price;
	private String features[];
	private List<String> categories;
	private Set<String> tags;
	private Map<String, Integer> stock; // Key → Warehouse name Value → Quantity
	private Supplier supplier;
}
