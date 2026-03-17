package com.nit.sbenas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Employee {
	@Value("${employee.employeeId}")
	private int employeeId;
	
	@Value ("${employee.name}")
	private String name;
	
	@Value ("${employee.monthlySalary}")
	private double monthlySalary;
	
	@Value ("${employee.bonus}")
	private double bonus;
	
	public String toString() {
		double yearlySalary = (monthlySalary *12) + bonus;
		return "Employee details"
				+ "\r"
				+ "Monthly salary: "+this.monthlySalary+"\r"
				+ "\r"
				+ "Bonus: "+this.bonus+"\r"
				+ "\r"
				+ "Final yearly salary: "+yearlySalary+"";
	}
}
