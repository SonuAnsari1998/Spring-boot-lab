package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.EmployeeDAO;
import com.nit.sbeans.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDAO dao;
	public void addData(Employee emp) {
		dao.insertData(emp);
	}
}
