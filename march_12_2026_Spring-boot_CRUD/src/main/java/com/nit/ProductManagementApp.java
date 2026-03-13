package com.nit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.control.ControllerLayer;
import com.nit.sbeans.Product;

@SpringBootApplication
public class ProductManagementApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(ProductManagementApp.class, args);

		ControllerLayer controller = ctx.getBean(ControllerLayer.class);

		System.out.println("CRUD Application\n");
		System.out.println("1. Insert");
		System.out.println("2. View");
		System.out.println("3. Delete");
		System.out.println("4. Update");
		System.out.println("5. Exit");

		int choice = Integer.parseInt(IO.readln("Enter your choice!!!"));

		switch (choice) {
		case 1 -> {
			int pId = Integer.parseInt(IO.readln("Enter Product id"));
			String pName = IO.readln("Enter product name");
			String pDes = IO.readln("Enter product description");
			double price = Double.parseDouble(IO.readln("Enter product price"));
			Product p = new Product(pId, pName, pDes, price);
			controller.addProduct(p);
		}
		case 2 -> {
			List<Product> list = controller.retrieveAllProducts();

			System.out.println();
			list.forEach(emp -> {
				System.out.println(emp);
			});
		}
		case 3 -> {
			int pId = Integer.parseInt(IO.readln("Enter Product id"));
			controller.deleteProduct(pId);
		}
		case 4 -> {
			int pId = Integer.parseInt(IO.readln("Enter Product id "));
			String pName = IO.readln("Enter product name");
			String pDes = IO.readln("Enter product description");
			double price = Double.parseDouble(IO.readln("Enter product price"));
			Product p = new Product(pId, pName, pDes, price);
			controller.updateProduct(p);
		}
		default -> {
			System.err.println("Thank you ");
			System.exit(0);
		}
		}
	}
}
