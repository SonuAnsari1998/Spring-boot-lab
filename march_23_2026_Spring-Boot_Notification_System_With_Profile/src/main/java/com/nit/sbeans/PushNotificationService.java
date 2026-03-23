package com.nit.sbeans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class PushNotificationService implements NotificationService {

	@Override
	public void sendNotification(Notification n) {
		System.out.println("Sending Push to " + n.getRecipient() + ": " + n.getMessage() + "");

	}

}
