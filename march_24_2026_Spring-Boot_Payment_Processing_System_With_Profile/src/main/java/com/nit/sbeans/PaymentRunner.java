package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PaymentRunner implements CommandLineRunner {

	@Autowired
	PaymentService paymentService;

	@Override
	public void run(String... args) throws Exception {
		Payment p= new Payment(101,5000,"ONLINE");
		paymentService.processPayment(p);

	}

}
