package com.nit.main;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class CrudAppApplication {
	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasenames("com/nit/props/message");
		return source;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CrudAppApplication.class, args);
		System.out.println("Enter language code");
		
		
		String lang = IO.readln();
		Locale locale = Locale.of(lang);
		String message = ctx.getMessage("welcome", new Object[] {}, locale);
		System.out.println(message);
	}

}
