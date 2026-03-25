package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.service.ProductService;

@SpringBootApplication
public class March252026Test02ProductPriceConfigUsingValueAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(March252026Test02ProductPriceConfigUsingValueAnnotationApplication.class, args);
		ProductService pro = ctx.getBean(ProductService.class);
		pro.finalPrice();
	}

}
