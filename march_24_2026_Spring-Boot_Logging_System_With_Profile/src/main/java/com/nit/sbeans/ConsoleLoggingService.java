package com.nit.sbeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class ConsoleLoggingService implements LoggingService {

	@Override
	public void log(LogMessage msg) {
		System.out.println("Console Log: " + msg.getMessage());

	}

}
