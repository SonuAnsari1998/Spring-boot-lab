package com.nit.sbeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DummyPaymentService implements PaymentService {

	@Override
	public void processPayment(Payment p) {
		System.out.println("Processing Dummy Payment of " + p.getAmount());

	}

}
