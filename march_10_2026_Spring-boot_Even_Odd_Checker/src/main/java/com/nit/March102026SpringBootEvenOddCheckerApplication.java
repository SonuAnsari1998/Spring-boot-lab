package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.NumberService;

@SpringBootApplication
public class March102026SpringBootEvenOddCheckerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(March102026SpringBootEvenOddCheckerApplication.class,
				args);
		NumberService ns = ctx.getBean(NumberService.class);

		int num = Integer.parseInt(IO.readln("Enter a Number"));
		System.out.println(num + " is " + ns.checkEvenOdd(num));
	}

}
