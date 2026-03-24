package com.ni.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class EmailRunner implements CommandLineRunner{
	@Autowired
	EmailService emailService;
	@Override
	public void run(String... args) throws Exception {
		Email em= new Email("Naresh it", "Addmission");
		emailService.sendEmail(em);
	}

}
