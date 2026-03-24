package com.nit.sbeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class DatabaseLoggingService implements LoggingService {

	@Override
	public void log(LogMessage msg) {
		System.out.println("Saving Log to DB: " + msg.getMessage());

	}

}
