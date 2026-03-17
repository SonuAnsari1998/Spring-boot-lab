package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.UserLogin;

@SpringBootApplication
public class March172026SpringBootValueAnnotationUserLoginValidationSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication
				.run(March172026SpringBootValueAnnotationUserLoginValidationSystemApplication.class, args);
		
		UserLogin userLogin = ctx.getBean(UserLogin.class);
		System.out.println(userLogin);
	}

}
