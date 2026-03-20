package com.nit.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.sbeans.Product;
import com.nit.sbeans.Store;

@Component
public class StoreRunner implements CommandLineRunner {

	@Autowired
	private Store store;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("\n	---- Product List ----");
		for (Product p : store.getProducts()) {
			System.out.println("ID : " + p.getId() + " | Name : " + p.getName() + "  | Price : " + p.getPrice() + "");

		}
	}

}
