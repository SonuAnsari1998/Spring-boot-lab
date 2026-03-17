package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.Library;

@SpringBootApplication
public class March172026SpringBootValueAnnotationLibraryFineCalculationSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication
				.run(March172026SpringBootValueAnnotationLibraryFineCalculationSystemApplication.class, args);
		Library book = ctx.getBean(Library.class);
		System.out.println(book);
	}

}
