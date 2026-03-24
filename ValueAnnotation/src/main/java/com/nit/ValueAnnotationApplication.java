package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.Employee;

@SpringBootApplication
public class ValueAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ValueAnnotationApplication.class, args);
		Employee emp = ctx.getBean(Employee.class);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
	}

}
