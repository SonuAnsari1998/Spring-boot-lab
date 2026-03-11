package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.sbean.Employee;
import com.nit.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	public void addEmployee(Employee emp) {
		empService.saveEmployee(emp);
		
	}
}
