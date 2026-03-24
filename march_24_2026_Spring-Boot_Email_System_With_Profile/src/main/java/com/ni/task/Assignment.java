/*Task 5: Email System with @Profile + Properties

Step 1: Model Class

Email
Fields:

to
subject
body
Step 2: Interface

EmailService

Method:

sendEmail(Email email)
Step 3: application.properties

email.dev.sender=dev@gmail.com
email.test.sender=test@gmail.com
email.prod.sender=prod@gmail.com

Step 4: Profile Implementations

Dev Profile

Uses @Value("${email.dev.sender}")
Prints → "Dev Email sent from <sender>"

TestProfile
+
Uses test sender

Prod Profile

Uses prod sender
Step 5: Runner
Send email
*/