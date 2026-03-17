/*Task 5 — User Login Validation System
Objective
To validate user credentials using values from properties file.
Description
Login systems often store default credentials in configuration for testing or admin access. This task demonstrates how to compare user input with injected values.

The system should:

Read username and password from properties

Accept user input from console

Validate credentials

Display success or failure message

📥 Input

Username (from properties + user input)

Password (from properties + user input)

⚙Processing Logic

Inject stored credentials using @Value

Read user input using Scanner

Compare both values using condition

📤 Expected Output

If correct → "Login Successful"

If incorrect → "Invalid Credentials"*/