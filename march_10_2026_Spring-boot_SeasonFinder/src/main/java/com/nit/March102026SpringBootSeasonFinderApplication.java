package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.SeasonService;

@SpringBootApplication
public class March102026SpringBootSeasonFinderApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(March102026SpringBootSeasonFinderApplication.class,
				args);

		while (true) {
			int mon = Integer.parseInt(IO.readln("Enter month number (1–12):"));

			SeasonService bean = ctx.getBean(SeasonService.class);
			System.out.println("\n" + bean.getSeason(mon));
		}

	}

}
