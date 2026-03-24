package com.nit.sbeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class UpiPaymentService implements PaymentService {

	@Override
	public void processPayment(Payment p) {
		System.out.println("Processing UPI Payment of " + p.getAmount());

	}

}
