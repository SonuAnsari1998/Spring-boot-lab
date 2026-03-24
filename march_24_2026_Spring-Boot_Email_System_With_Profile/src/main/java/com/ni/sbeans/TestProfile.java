package com.ni.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestProfile implements EmailService {
	@Override
	public void sendEmail(Email email) {
		System.out.println("Subject :"+email.getSubject());
		System.out.println("Body :"+email.getBody());
	}

}
