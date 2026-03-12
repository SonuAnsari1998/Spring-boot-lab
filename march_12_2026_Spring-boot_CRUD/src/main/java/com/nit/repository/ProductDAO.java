package com.nit.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.nit.control.ControllerLayer;
import com.nit.sbeans.Product;

@Repository
public class ProductDAO {

	private static final String INSERT_DATA = "insert into product20 values(?,?,?,?)";
	private static final String DISPLAY_DATA = "SELECT * FROM PRODUCT20";
	private static final String DELETE_DATA = "DELETE PRODUCT20 WHERE PRODUCTID=?";
	private static final String UPDATE_DATA = "UPDATE product20 SET PRODUCTNAME=?, DESCRIPTION=?, PRICE=? WHERE PRODUCTID=?";

	@Autowired
	DataSource ds;


//Method to insert a new product record into the database.
	public void insertProduct(Product product) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(INSERT_DATA);
			pstmt.setInt(1, product.getProductId());
			pstmt.setString(2, product.getProductName());
			pstmt.setString(3, product.getDescription());
			pstmt.setDouble(4, product.getPrice());

			int rowCount = pstmt.executeUpdate();
			if (rowCount > 0) {
				System.out.println("Product id " + product.getProductId() + " Added Sucessfully!!!");
			} else {
				System.out.println("Product " + product.getProductId() + " already exits...");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// Method to retrieve all product records from the database.
	List<Product> productList = null;

	public List<Product> getAllProducts() {
		productList = new ArrayList<Product>();
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(DISPLAY_DATA);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Product product = new Product();

				product.setProductId(rs.getInt(1));
				product.setProductName(rs.getString(2));
				product.setDescription(rs.getString(3));
				product.setPrice(rs.getDouble(4));
				productList.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return productList;

	}

// Method to delete a product by its ID.
	public void deleteProduct(int productId) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(DELETE_DATA);
			pstmt.setInt(1, productId);
			int rowCount = pstmt.executeUpdate();
			if (rowCount > 0) {
				System.out.println("Product id " + productId + " Deleted Sucessfully!!!");
			} else {
				System.out.println("Product " + productId + " not found...");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

// Method to update an existing product.
	public void updateProduct(Product product) {
		try {
			System.out.println("update stated");
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement(UPDATE_DATA);
			pstmt.setString(1, product.getProductName());
			pstmt.setString(2, product.getDescription());
			pstmt.setDouble(3, product.getPrice());
			pstmt.setInt(4, product.getProductId());
			System.out.println("seted the values");
			int rowCount = pstmt.executeUpdate();
			System.out.println("ex updated");
			if (rowCount > 0) {
				System.out.println("Product id " + product.getProductId() + " Updated Sucessfully!!!");
			} else {
				System.out.println("Product " + product.getProductId() + " not Updated");
			}
		} catch (Exception e) {
			e.printStackTrace();
	System.out.println("ence[tion");
		}
	}
}
