package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.controller.EmployeeController;
import com.nit.sbean.Employee;

@SpringBootApplication
public class LayeredApp_Mini_Project_Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(LayeredApp_Mini_Project_Application.class, args);

		EmployeeController empController = ctx.getBean(EmployeeController.class);
		String id = IO.readln("Enter Employee id");
		String fname = IO.readln("Enter Employee fname");
		String lname = IO.readln("Enter Employee lname");
		String sal = IO.readln("Enter Employee sal");
		String add = IO.readln("Enter Employee add");
		Employee emp = new Employee(id, fname, lname, sal, add);
		empController.addEmployee(emp);
	}

}
