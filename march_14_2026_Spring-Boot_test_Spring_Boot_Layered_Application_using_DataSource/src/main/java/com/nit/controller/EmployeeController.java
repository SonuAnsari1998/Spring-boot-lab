package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.sbeans.Employee;
import com.nit.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	public void createEmployee(Employee emp) {
		empService.addEmployee(emp);
	}
	
	public List<Employee> viewDetails(){
		return empService.showData();
	}
	
	public void removeEmployeeData(int id) {
		empService.removeData(id);
	}
	
	public void updateEmployeeData(Employee emp) {
		empService.modifyData(emp);
	}
}
