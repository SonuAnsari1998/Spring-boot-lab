package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.repo.EmployeeRepo;
import com.nit.sbeans.Employee;

@SpringBootApplication
public class CrudAppLayeredApplicationUsingPlainJdbcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication
				.run(CrudAppLayeredApplicationUsingPlainJdbcApplication.class, args);
		EmployeeRepo empRepo = ctx.getBean(EmployeeRepo.class);
		while(true) {
			System.out.println(
					"CRUD Application\n1. Add Employee Details\n2. View Employee Details\n3. Update Employee Details\n4. Delete Employee Details\n5. Exit.");

			int choice = Integer.parseInt(IO.readln("Enter your choice"));
			switch(choice) {
			case 1->{
				int eid = Integer.parseInt(IO.readln("Enter employee id"));
				String eFname = IO.readln("Enter Employee First Name");
				String eLname = IO.readln("Enter Employee Last Name");
				double eSal = Double.parseDouble(IO.readln("Enter Employee Salary"));
				String eAddress = IO.readln("Enter Employee Address");
				Employee emp = new Employee(eid,eFname,eLname,eSal,eAddress);
				empRepo.addEmployee(emp);
			}
			case 2->{
				
			}
			case 3->{
				
			}
			case 4->{
				
			}
			case 5->{
				System.out.println("Thank you !!!");
				System.exit(0);
			}
			default -> System.err.println("Invalid choice...");
			}
		}
	}

}
