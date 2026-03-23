package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NotificationRunner implements CommandLineRunner {

	@Autowired
	NotificationService notificationService;

	@Override
	public void run(String... args) throws Exception {

		notificationService.sendNotification(new Notification(101, "Good Morning", "Sonu"));

	}

}
