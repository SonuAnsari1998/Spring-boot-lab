package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.DiscountService;

@SpringBootApplication
public class March102026SpringBootProductDiscountCalculatorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication
				.run(March102026SpringBootProductDiscountCalculatorApplication.class, args);

		DiscountService serv = ctx.getBean(DiscountService.class);

		double oPrice = Double.parseDouble(IO.readln("Enter original price:"));
		double dPrice = Double.parseDouble(IO.readln("Enter discount percentage:"));

		System.out.println("\nPrint the result:");
		System.out.println("Apply " + dPrice + " Percentage");
		System.out.println("Final price after discount: $" + serv.applyDiscount(oPrice, dPrice));
	}

}
