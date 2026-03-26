package com.nit.sbeans;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmployeeRunner implements CommandLineRunner{

	@Autowired
	Employee employee;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Employee Detaisl: ");
		
		IO.println("Employee id: "+employee.getId());
		IO.println("Employee Name: "+employee.getName());
		IO.println("Employee Salary: "+employee.getSalary());
		
		//Array
		IO.println("\nEmployee skill: ");
		for(String skills: employee.getSkills()) {
			IO.println(skills);
		}
		
		//List
		IO.println("\nEmployee projects: ");
		for(String project: employee.getProjects()) {
			IO.println(project);
		}
		
		//Set
		IO.println("\nEmployee tools: ");
		for(String tools: employee.getTools()) {
			IO.println(tools);
		}
		
		//Map
		IO.println("\nEmployee experience: ");
		for(Map.Entry<String, Integer> entry : employee.getExperience().entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		//Address Object
		IO.println("\nEmployee address: ");
		IO.println("City: "+employee.address.city);
		IO.println("State: "+employee.address.state);
		IO.println("Pincode: "+employee.address.pincode);
		
		
		
	}

}
