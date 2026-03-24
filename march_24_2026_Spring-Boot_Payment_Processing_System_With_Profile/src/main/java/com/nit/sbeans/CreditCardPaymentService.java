package com.nit.sbeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class CreditCardPaymentService implements PaymentService {

	@Override
	public void processPayment(Payment p) {
		System.out.println("Processing Credit Card Payment of " + p.getAmount());

	}

}
