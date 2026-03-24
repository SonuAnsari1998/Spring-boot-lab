package com.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRunner implements CommandLineRunner {

	@Autowired
	AuthService authService;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("sonu","123");
		authService.authenticate(user);
	}

}
