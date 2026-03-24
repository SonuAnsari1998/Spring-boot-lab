/*Task 2: Logging System with @Profile


Step 1: Model Class

LogMessage
Fields:

id
message
level

Step 2: Interface

LoggingService

Method:

log(LogMessage msg)

Step 3: Profile-Based Implementations

Dev Profile

ConsoleLoggingService

Prints → "Console Log: <message>"

Test Profile
FileLoggingService
Prints → "Writing Log to File: <message>"

Prod Profile

DatabaseLoggingService
Prints → "Saving Log to DB: <message>"
Step 4: LoginRunner
Send one log message
Output depends on profile*/
