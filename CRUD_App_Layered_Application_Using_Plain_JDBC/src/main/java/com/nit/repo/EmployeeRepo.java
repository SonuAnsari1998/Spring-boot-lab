package com.nit.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.sbeans.Employee;
import com.nit.service.EmployeeService;

@Repository
public class EmployeeRepo {
	@Autowired
	EmployeeService employeeService;
	public void addEmployee(Employee emp) {
		employeeService.addData(emp);
	}
}
