/*Task 1: Payment Processing System with @Profile

Step 1: Model Class

Payment

Fields:

id
amount
method

Step 2: Interface

PaymentService

Method:
processPayment(Payment p)

Step 3: Profile-Based Implementations

Dev Profile (@Profile("dev"))
Class: DummyPaymentService
Logic:
Prints → "Processing Dummy Payment of <amount>"

Test Profile (@Profile("test"))

Class: UpiPaymentService
Logic:
Prints → "Processing UPI Payment of <amount>"

Prod Profile (@Profile("prod"))

Class: CreditCardPaymentService
Logic:
Prints → "Processing Credit Card Payment of <amount>"
Step 4: PaymentRunner
Autowire PaymentService
Create Payment object
Call processPayment()

Sample Input (Runner)
id = 101
amount = 5000
method = "ONLINE"
🔹 Output

Dev Profile (dev)

Processing Dummy Payment of 5000

Test Profile (test)

Processing UPI Payment of 5000

Prod Profile (prod)

Processing Credit Card Payment of 5000*/
