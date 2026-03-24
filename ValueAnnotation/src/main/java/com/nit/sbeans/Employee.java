package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Employee {
	
	@Value("${emp.id}")
	int id;
	
	@Value("${emp.name}")
	String name;
	
	@Value("${emp.salary}")
	double salary;
}
