package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.EmployeeDAO;
import com.nit.sbeans.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDAO dao;

	public void insertData(Employee emp) {
		dao.add(emp);
	}
	
	
	public void remove(int id) {
		dao.delete(id);
	}
	
	public List<Employee> showEmployee(){
		return dao.getData();
		
	}
}
