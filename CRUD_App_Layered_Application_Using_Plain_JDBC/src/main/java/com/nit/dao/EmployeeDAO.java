package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.sbeans.Employee;

@Component
public class EmployeeDAO {
	String INSERT_DATA = "insert into employee values(?,?,?,?,?)";
	@Autowired
	DataSource ds;

	public void insertData(Employee emp) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(INSERT_DATA);
			pstmt.setInt(1, emp.getEid());
			pstmt.setString(2, emp.getEFname());
			pstmt.setString(3, emp.getELname());
			pstmt.setDouble(4, emp.getESal());
			pstmt.setString(5, emp.getEAddress());
			int rowCount = pstmt.executeUpdate();
			if (rowCount > 0) {
				System.out.println("Employee id " + emp.getEid() + " is Added sucessfully!!!");
			} else {
				System.err.println("Something went wrong....may be id already exists..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
