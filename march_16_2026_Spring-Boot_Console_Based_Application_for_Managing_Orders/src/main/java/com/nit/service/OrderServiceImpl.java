package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.repository.IOrderDAO;
import com.nit.sbeans.Order;

@Service
public class OrderServiceImpl implements IOrderService {

	@Autowired
	IOrderDAO iOrderDAO;

	@Override
	public void addOrder(Order order) {
		iOrderDAO.insertOrder(order);
	}

	@Override
	public List<Order> retrieveAllOrders() {
		return iOrderDAO.getAllOrders();
	}

	@Override
	public void deleteOrder(int orderId) {
		iOrderDAO.deleteOrder(orderId);
	}

	@Override
	public void updateOrder(Order order) {
		iOrderDAO.updateOrder(order);
	}

}
