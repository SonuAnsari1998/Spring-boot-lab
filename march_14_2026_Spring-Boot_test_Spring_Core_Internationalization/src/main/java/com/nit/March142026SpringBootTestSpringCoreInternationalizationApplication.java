package com.nit;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class March142026SpringBootTestSpringCoreInternationalizationApplication {
	
	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource resource = new ResourceBundleMessageSource();
		resource.setBasenames("com/nit/prop/message");
		return resource;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(March142026SpringBootTestSpringCoreInternationalizationApplication.class, args);
		
		String language =IO.readln("Enter language");
		
		Locale locale = Locale.of(language);
		
		String message = ctx.getMessage("message", new Object[] {} ,locale);
		
		System.out.println(message);
	}

}
