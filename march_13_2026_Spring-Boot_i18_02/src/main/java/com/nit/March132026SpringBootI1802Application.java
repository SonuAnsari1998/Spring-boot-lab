package com.nit;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class March132026SpringBootI1802Application {

	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource resource = new ResourceBundleMessageSource();
		resource.setBasenames("com/nit/props/message");
		return resource;

	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(March132026SpringBootI1802Application.class, args);

		String lag = IO.readln("Enter language(hi/fr/odi/tel)").toLowerCase();
		
		Locale locale = Locale.of(lag);
		String message = ctx.getMessage("message", new Object[] {} ,locale);
		IO.print(message);
	}

}
