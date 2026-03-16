package com.nit.repository;

import java.awt.dnd.DragSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.sbeans.Order;

@Repository
public class OrderDAOImpl implements IOrderDAO {
	private final String INSERT_ORDER = "insert into OrderManagement values (?,?,?,?)";
	private final String GET_ORDER = "select * from OrderManagement";
	private final String DELETE_ORDER = "delete from OrderManagement where ORDERID=?";
	private final String UPDATE_ORDER = "update OrderManagement set ORDERDATE=?, CUSTOMERNAME=?, TOTALAMOUNT=? where ORDERID=?";

	@Autowired
	DataSource ds;

	@Override
	public void insertOrder(Order order) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(INSERT_ORDER);
			ps.setInt(1, order.getOrderId());
			ps.setString(2, order.getOrderDate());
			ps.setString(3, order.getCustomerName());
			ps.setDouble(4, order.getTotalAmount());
			int rowCount = ps.executeUpdate();
			if (rowCount > 0) {
				IO.println("Order id: " + order.getOrderId() + " Added Sucessfully!!!");
			} else {
				IO.println("Order id: " + order.getOrderId() + " Already exits");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Order> getAllOrders() {
		List<Order> orderList = new ArrayList<Order>();
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(GET_ORDER);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Order order = new Order();
				order.setOrderId(rs.getInt(1));
				order.setOrderDate(rs.getString(2));
				order.setCustomerName(rs.getString(3));
				order.setTotalAmount(rs.getDouble(4));
				orderList.add(order);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return orderList;
	}

	@Override
	public void deleteOrder(int orderId) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(DELETE_ORDER);
			ps.setInt(1, orderId);
			int rowCount = ps.executeUpdate();
			if (rowCount > 0) {
				IO.println("Order id: " + orderId + " Deleted Sucessfully!!!");
			} else {
				IO.println("Order id: " + orderId + " not found...");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateOrder(Order order) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement(UPDATE_ORDER);
			ps.setString(1, order.getOrderDate());
			ps.setString(2, order.getCustomerName());
			ps.setDouble(3, order.getTotalAmount());
			ps.setInt(4, order.getOrderId());
			int rowCount = ps.executeUpdate();
			if (rowCount > 0) {
				IO.println("Order id: " + order.getOrderId() + " Updated Sucessfully!!!");
			} else {
				IO.println("Order id: " + order.getOrderId() + " not found...");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
