package com.nit.entites;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "emp")
public class Employee {
	int id;
	String name;
	double salary;
}
