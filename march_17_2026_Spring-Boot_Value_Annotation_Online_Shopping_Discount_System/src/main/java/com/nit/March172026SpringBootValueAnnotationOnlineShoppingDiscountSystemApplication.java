package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.Product;

@SpringBootApplication
public class March172026SpringBootValueAnnotationOnlineShoppingDiscountSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(March172026SpringBootValueAnnotationOnlineShoppingDiscountSystemApplication.class, args);
		
		Product product = ctx.getBean(Product.class);
		System.out.println(product);
	}

}
