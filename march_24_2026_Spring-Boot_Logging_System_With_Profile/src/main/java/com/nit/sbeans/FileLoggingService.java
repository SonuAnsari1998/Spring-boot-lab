package com.nit.sbeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class FileLoggingService implements LoggingService {

	@Override
	public void log(LogMessage msg) {
		System.out.println("Writing Log to File: " + msg.getMessage());

	}

}
