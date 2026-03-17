package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbenas.Employee;

@SpringBootApplication
public class March172026SpringBootValueAnnotationEmployeeSalaryBonusCalculationSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(March172026SpringBootValueAnnotationEmployeeSalaryBonusCalculationSystemApplication.class, args);
	
		Employee employee = ctx.getBean(Employee.class);
		System.out.println(employee);
	}

}
