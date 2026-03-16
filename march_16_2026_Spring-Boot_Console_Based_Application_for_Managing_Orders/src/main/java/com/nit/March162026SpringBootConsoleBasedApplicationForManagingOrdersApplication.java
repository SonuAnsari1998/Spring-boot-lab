package com.nit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.controller.OrderController;
import com.nit.sbeans.Order;

@SpringBootApplication
public class March162026SpringBootConsoleBasedApplicationForManagingOrdersApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication
				.run(March162026SpringBootConsoleBasedApplicationForManagingOrdersApplication.class, args);
		OrderController orderController = ctx.getBean(OrderController.class);
		IO.println("\nOrder Management Application");
		IO.println("1. Insert a new order.\n" + "2. Retrieve all orders.\n" + "3. Delete an order by its ID.\n"
				+ "4. update an order by its ID.\n" + "5. Exit");
		int choice = Integer.parseInt(IO.readln("Enter your choice!!!"));

		switch (choice) {
		case 1 -> {
			int orderId = Integer.parseInt(IO.readln("Enter Order id"));
			String orderDate = IO.readln("Enter order Date");
			String customerName = IO.readln("Enter customer name");
			double totalAmount = Double.parseDouble(IO.readln("Enter total amount"));
			Order order = new Order(orderId, orderDate, customerName, totalAmount);
			orderController.addOrder(order);
		}
		case 2 -> {
			List<Order> allOrders = orderController.retrieveAllOrders();
			System.out.println("\nAll Order Details");
			for(Order order: allOrders) {
				IO.println(order);
				
			}
			System.out.println();
		}
		case 3 -> {
			int orderId = Integer.parseInt(IO.readln("Enter Order id"));
			orderController.deleteOrder(orderId);
		}
		case 4 -> {
			int orderId = Integer.parseInt(IO.readln("Enter Order id want to update"));
			String orderDate = IO.readln("Enter order new Date");
			String customerName = IO.readln("Enter new customer name");
			double totalAmount = Double.parseDouble(IO.readln("Enter new total amount"));
			Order order = new Order(orderId, orderDate, customerName, totalAmount);
			orderController.updateOrder(order);

		}
		case 5 -> {
			IO.println("Thank you!!!");
			System.exit(0);

		}
		default -> System.err.println("Invalid choice...");
		}
	}

}
