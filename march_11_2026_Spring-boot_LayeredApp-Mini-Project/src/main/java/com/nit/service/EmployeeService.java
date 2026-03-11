package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.DAO.EmployeeDAO;
import com.nit.sbean.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO empDAO;

	public void saveEmployee(Employee emp) {
		empDAO.insertEmployee(emp);
		
	}
}
