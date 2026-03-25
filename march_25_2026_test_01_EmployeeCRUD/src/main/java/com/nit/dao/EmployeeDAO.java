package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.sbeans.Employee;

@Component
public class EmployeeDAO {
	private final Employee employee;
	String ADD = "insert into employee10 values (?, ?, ?, ?)";
	String DELETE = "delete from employee10 where id=?";
	String GET_ALL = "select * from employee10";
	@Autowired
	DataSource ds;

	EmployeeDAO(Employee employee) {
		this.employee = employee;
	}

	// Add
	public void add(Employee emp) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(ADD);
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2, emp.getName());
			pstmt.setString(3, emp.getDepartment());
			pstmt.setDouble(4, emp.getSalary());
			int rowCount = pstmt.executeUpdate();
			if (rowCount > 0) {
				System.out.println("Employee added sucessfully!!!");
			} else {
				System.err.println("Something went wrong...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// delete
	public void delete(int id) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(DELETE);
			pstmt.setInt(1, id);
			int rowCount = pstmt.executeUpdate();
			if (rowCount > 0) {
				System.out.println("Employee id " + id + " Deleted sucessfully!!!");
			} else {
				System.err.println("Something went wrong (may be employee id" + id + " alredy exist)");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// get all
	public List<Employee> getData() {
		List<Employee> empList = new ArrayList();
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(GET_ALL);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setDepartment(rs.getString(3));
				emp.setSalary(rs.getDouble(4));
				empList.add(emp);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return empList;
	}

}
