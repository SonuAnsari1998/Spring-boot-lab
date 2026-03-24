package com.nit;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class OTPAuthService implements AuthService{

	@Override
	public void authenticate(User user) {
		System.out.println("OTP sent to user");
		
	}

}
