/*Task 2 — Online Shopping Discount System
Objective

To calculate final product price after applying discount using @Value and SpEL.

Description

In e-commerce applications, product price and discount percentage are often stored in 
configuration files. This task demonstrates how to dynamically calculate the discounted 
price using Spring Expression Language (SpEL).

The system should:

Read product name, price, and discount percentage

Apply discount formula

final price = price - (price × discount / 100)

Display original and final price

Input

Product Name

Original Price

Discount Percentage

Processing Logic

Inject values using @Value

Use SpEL expression inside @Value for calculation

Store computed final price

Expected Output
Product Details:
Product name
Original price
Discount percentage
Final discounted price
*/