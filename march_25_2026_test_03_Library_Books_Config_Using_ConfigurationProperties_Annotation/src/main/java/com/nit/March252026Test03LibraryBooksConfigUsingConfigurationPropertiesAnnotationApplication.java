package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.service.LibraryService;

@SpringBootApplication
public class March252026Test03LibraryBooksConfigUsingConfigurationPropertiesAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(March252026Test03LibraryBooksConfigUsingConfigurationPropertiesAnnotationApplication.class, args);
		LibraryService libraryService = ctx.getBean(LibraryService.class);
		libraryService.showBook();
	}

}
