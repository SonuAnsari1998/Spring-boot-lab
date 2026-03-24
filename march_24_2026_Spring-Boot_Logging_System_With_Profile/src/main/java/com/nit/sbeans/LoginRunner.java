package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LoginRunner implements CommandLineRunner {

	@Autowired
	LoggingService loggingService;

	@Override
	public void run(String... args) throws Exception {
		LogMessage msg = new LogMessage(101, "Hello", "Good Morning");
		loggingService.log(msg);

	}

}
