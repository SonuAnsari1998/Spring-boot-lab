package com.nit.service;

import java.util.List;

import com.nit.sbeans.Order;

public interface IOrderService {
	void addOrder(Order order);

	List<Order> retrieveAllOrders();

	void deleteOrder(int orderId);

	void updateOrder(Order order);
}
