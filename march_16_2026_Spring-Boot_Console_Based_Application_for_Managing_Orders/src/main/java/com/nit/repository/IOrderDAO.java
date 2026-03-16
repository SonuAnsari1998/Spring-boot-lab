package com.nit.repository;

import java.util.List;

import com.nit.sbeans.Order;

public interface IOrderDAO {
	 void insertOrder(Order order);
	 List<Order> getAllOrders();
	 void deleteOrder(int orderId);
	 void updateOrder(Order order); 
}
