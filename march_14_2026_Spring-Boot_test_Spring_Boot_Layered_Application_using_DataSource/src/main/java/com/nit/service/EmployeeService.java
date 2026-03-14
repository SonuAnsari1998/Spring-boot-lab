package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.EmployeeDAO;
import com.nit.sbeans.Employee;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDAO empDAO;
	
	public void addEmployee(Employee emp) {
		empDAO.insertData(emp);
	}
	
	public List<Employee> showData(){
		return empDAO.viewData();
	}
	
	public void removeData(int id) {
		empDAO.deleteData(id);
	}
	
	public void modifyData(Employee emp) {
		empDAO.updateData(emp);
	}
	
}
