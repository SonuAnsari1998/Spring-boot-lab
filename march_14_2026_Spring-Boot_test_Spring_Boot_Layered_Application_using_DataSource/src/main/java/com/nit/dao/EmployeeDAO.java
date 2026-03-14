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

	private final String INSERT_DATA = "insert into employee values(?,?,?,?,?)";
	private final String VIEW_DATA = "select * from employee";
	private final String DELETE_DATA = "delete from employee where eid=?";
	private final String UPDATE_DATA = "update employee set EFNAME=?, ELNAME=?, ESAL=?, EADDRESS=? where eid=?";

	@Autowired
	DataSource ds;

	// insert
	public void insertData(Employee emp) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(INSERT_DATA);
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getFname());
			ps.setString(3, emp.getLname());
			ps.setDouble(4, emp.getSalary());
			ps.setString(5, emp.getAddress());
			int rowCount = ps.executeUpdate();
			if (rowCount > 0) {
				IO.println("Employee id " + emp.getId() + " Added Sucessfully!!!");
			} else {
				System.out.println("Employee id " + emp.getId() + " Not Added Something went wrong...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// view
	public List<Employee> viewData() {
		List<Employee> list = new ArrayList<>();

		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(VIEW_DATA);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setFname(rs.getString(2));
				emp.setLname(rs.getString(3));
				emp.setSalary(rs.getDouble(4));
				emp.setAddress(rs.getString(5));
				list.add(emp);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	// delete
	public void deleteData(int id) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(DELETE_DATA);
			ps.setInt(1, id);
			int rowCount = ps.executeUpdate();
			if(rowCount>0) {
				IO.println("Employee id "+id+" Deleted Sucessfully!!!");
			}else {
				IO.println("Employee id "+id+" Not deleted something went wrong...");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//update
	public void updateData(Employee emp) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(UPDATE_DATA);
			ps.setString(1, emp.getFname());
			ps.setString(2, emp.getLname());
			ps.setDouble(3, emp.getSalary());
			ps.setString(4, emp.getAddress());
			ps.setInt(5, emp.getId());
			int rowCount = ps.executeUpdate();
			if(rowCount>0) {
				IO.println("Employee id "+emp.getId()+" Updated Sucessfully!!!");
			}else {
				IO.println("Emloyee id "+emp.getId()+" Not Upadated...something went wrong");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
