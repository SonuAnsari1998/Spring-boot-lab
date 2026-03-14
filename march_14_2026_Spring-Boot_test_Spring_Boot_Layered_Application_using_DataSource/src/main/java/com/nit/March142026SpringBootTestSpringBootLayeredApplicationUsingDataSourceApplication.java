package com.nit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.controller.EmployeeController;
import com.nit.sbeans.Employee;

@SpringBootApplication
public class March142026SpringBootTestSpringBootLayeredApplicationUsingDataSourceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication
				.run(March142026SpringBootTestSpringBootLayeredApplicationUsingDataSourceApplication.class, args);

		EmployeeController empController = ctx.getBean(EmployeeController.class);

		IO.println("CRUD Application");
		IO.println("1. Insert Data");
		IO.println("2. View Data");
		IO.println("3. Delete Data");
		IO.println("4. Update Data");
		IO.println("5. Exit");
		int choice = Integer.parseInt(IO.readln("Enter your choice!!!"));
		switch (choice) {
		case 1 -> {
			int id = Integer.parseInt(IO.readln("Enter Employee id"));
			String fname = IO.readln("Enter Employee First Name");
			String lname = IO.readln("Enter Employee Last Name");
			double salary = Double.parseDouble(IO.readln("Enter Employee Salary"));
			String address = IO.readln("Enter Employee Address");
			Employee emp = new Employee(id, fname, lname, salary, address);
			empController.createEmployee(emp);
		}
		case 2 -> {
			List<Employee> viewDetails = empController.viewDetails();

			for (Employee emp : viewDetails) {
				IO.println(emp);
			}
		}
		case 3 -> {
			int id = Integer.parseInt(IO.readln("Enter Employee id you want to delete"));
			empController.removeEmployeeData(id);

		}
		case 4 -> {
			int id = Integer.parseInt(IO.readln("Enter Employee id you want to update "));
			String fname = IO.readln("Enter Employee new First Name");
			String lname = IO.readln("Enter Employee new Last Name");
			double salary = Double.parseDouble(IO.readln("Enter Employee new Salary"));
			String address = IO.readln("Enter Employee new Address");
			Employee emp = new Employee(id, fname, lname, salary, address);

			empController.updateEmployeeData(emp);

		}

		default -> System.err.println("Invalid choice Please Enter valid choice...");
		}
	}

}
