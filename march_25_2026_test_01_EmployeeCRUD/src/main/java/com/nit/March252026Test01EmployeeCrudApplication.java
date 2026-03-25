package com.nit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.controller.EmployeeController;
import com.nit.sbeans.Employee;

@SpringBootApplication
public class March252026Test01EmployeeCrudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(March252026Test01EmployeeCrudApplication.class,
				args);
		EmployeeController empController = ctx.getBean(EmployeeController.class);

		IO.println("1. Add\n" + "2. Delete\n" + "3. Get All");
		int choice = Integer.parseInt(IO.readln("Enter your choice!!!"));
		switch(choice) {
		case 1->{
			int id = Integer.parseInt(IO.readln("Enter Employee id"));
			String name = IO.readln("Enter Employee name");
			String department =IO.readln("Enter Employee department");
			double salary = Double.parseDouble(IO.readln("Enter Employee salary"));
			Employee emp = new Employee(id,name,department,salary);
			empController.createEmployee(emp);
		}
		case 2->{
			int id = Integer.parseInt(IO.readln("Enter Employee id (You want delete)"));
			empController.deleteEmp(id);
			
		}
		case 3->{
			List<Employee> viewDetails = empController.viewDetails();
			for(Employee e : viewDetails) {
				IO.println(e);
			}
		}
		
		default -> System.err.println("Invalid choice");
		}
	}

}
