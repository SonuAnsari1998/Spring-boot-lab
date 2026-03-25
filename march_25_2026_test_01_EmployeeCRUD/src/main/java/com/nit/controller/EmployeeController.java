package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.sbeans.Employee;
import com.nit.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	public void createEmployee(Employee emp) {
		employeeService.insertData(emp);
	}
	
	public void deleteEmp(int id) {
		employeeService.remove(id);
	}
	public List<Employee> viewDetails(){
		return employeeService.showEmployee();
		
	}
}
