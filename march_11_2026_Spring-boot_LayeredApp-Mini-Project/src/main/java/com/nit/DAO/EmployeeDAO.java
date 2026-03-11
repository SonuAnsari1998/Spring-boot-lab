package com.nit.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.sbean.Employee;

@Repository
public class EmployeeDAO {

	@Autowired
	DataSource ds;

	public void insertEmployee(Employee emp) {

		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?,?,?)");
			pstmt.setString(1, emp.getId());
			pstmt.setString(2, emp.getFname());
			pstmt.setString(3, emp.getLname());
			pstmt.setString(4, emp.getSal());
			pstmt.setString(5, emp.getAdd());

			int rows = pstmt.executeUpdate();
			if (rows > 0) {
				System.out.println("data Inserted");
			} else {
				System.out.println("data not Inserted");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
