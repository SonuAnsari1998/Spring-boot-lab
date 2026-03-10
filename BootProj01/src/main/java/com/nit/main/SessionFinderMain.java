package com.nit.main;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.nit.sbean.SessionFinder;

@SpringBootApplication
@ComponentScan(basePackages = "com.nit.sbean")
public class SessionFinderMain {
	
	@Bean
	public LocalDate createLD() {
		return LocalDate.now();
	}
	
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SessionFinderMain.class, args);
		SessionFinder sf = ctx.getBean(SessionFinder.class);
		String seasonName = sf.findSeasonName();
		System.out.println(seasonName);
	}

}
