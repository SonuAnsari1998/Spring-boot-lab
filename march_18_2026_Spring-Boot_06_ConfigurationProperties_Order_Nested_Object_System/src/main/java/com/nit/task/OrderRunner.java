package com.nit.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.sbeans.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRunner implements CommandLineRunner {

	@Autowired
	private Order order;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("---- Order Details ----");
		System.out.println("Order ID : " + order.getOrderId());

		System.out.println("\n---- Customer Details ----");
		System.out.println("Name     : "+order.getCustomer().getName()+"\r\n"
				+ "Address  : "+order.getCustomer().getAddress());

	}

}
