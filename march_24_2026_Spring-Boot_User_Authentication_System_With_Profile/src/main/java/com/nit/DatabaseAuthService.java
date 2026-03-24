package com.nit;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class DatabaseAuthService implements AuthService{

	@Override
	public void authenticate(User user) {
		System.out.println("Validating user from DB");
		
	}

}
