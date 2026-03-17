package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class UserLogin {
	
	@Value("${login.userName}")
	private String userName;
	
	@Value("${login.password}")
	private String password;
	
	public String toString() {
		if(userName.equals("sonu") && password.equals("sonu")) {
			return "Login Successful";
		}else {
			return "Invalid Credentials";
		}
	}
}
