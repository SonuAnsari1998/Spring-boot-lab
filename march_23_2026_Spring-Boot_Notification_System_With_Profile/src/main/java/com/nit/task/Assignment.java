/*Task 1: Notification System with @Profile
Step 1: Create Model Class

Notification

Fields: id, message, recipient.

Step 2: Define Interface

NotificationService

Method: sendNotification(Notification n).

Step 3: Implement Profile-Specific Services

Dev Profile

EmailNotificationService (@Profile("dev"))

Prints: "Sending Email to <recipient>: <message>".

Test Profile

SMSNotificationService (@Profile("test"))

Prints: "Sending SMS to <recipient>: <message>".

Prod Profile

PushNotificationService (@Profile("prod"))

Prints: "Sending Push Notification to <recipient>: <message>".

Step 4: NotificationRunner

Autowire NotificationService.

Create one Notification and send it.

Output depends on active profile.*/
