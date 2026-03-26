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
@ConfigurationProperties(prefix = "employee")
public class Employee {
	int id;
	String name;
	double salary;
	String skills[];
	List<String> projects;
	Set<String> tools;
	Map<String, Integer> experience; // Key → Technology Value → Years of experience
	Address address;
	
}
