package com.nit;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DummyAuthService implements AuthService{

	@Override
	public void authenticate(User user) {
		System.out.println("Sucess");
		
	}

}
