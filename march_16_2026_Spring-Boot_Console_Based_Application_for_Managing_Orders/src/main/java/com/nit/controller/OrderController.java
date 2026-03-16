package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.sbeans.Order;
import com.nit.service.IOrderService;

@Controller
public class OrderController {
	@Autowired
	IOrderService iOrderService;

	public void addOrder(Order order) {
		iOrderService.addOrder(order);

	}

	public List<Order> retrieveAllOrders() {
		return iOrderService.retrieveAllOrders();
	}

	public void deleteOrder(int orderId) {
		iOrderService.deleteOrder(orderId);
	}

	public void updateOrder(Order order) {
		iOrderService.updateOrder(order);
	}
}
