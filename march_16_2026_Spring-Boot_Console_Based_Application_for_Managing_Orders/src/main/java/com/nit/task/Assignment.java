/*Q2)
----
Spring Boot Console-Based Application for Managing Orders

Requirements:

Database Table Creation:
Create a database table named Order with the following columns:
orderId (int, primary key)
orderDate (Date)
customerName (String)
totalAmount (double)

Order Bean Class:
Define an Order class with the following fields:
orderId (int)
orderDate (String)
customerName (String)
totalAmount (double)
Include appropriate getters and setters for all fields.

Data Source Configuration:
Configure the data source in application.properties to connect to a database.

Repository Layer:
Create an interface IOrderDAO with the following methods:
insertOrder(Order order): Method to insert a new order record into the database.
List<Order> getAllOrders(): Method to retrieve all order records from the database.
deleteOrder(int orderId): Method to delete an order by its ID.
updateOrder(Order order): Method to update an existing order.

Create a class OrderDAOImpl that implements the IOrderDAO interface and provides the actual implementation for these methods.

Service Layer:
Create an interface IOrderService with the following methods:
addOrder(Order order): Method to add a new order.
List<Order> retrieveAllOrders(): Method to retrieve all orders.
deleteOrder(int orderId): Method to delete an order by its ID.
updateOrder(Order order): Method to update an order.

Create a class OrderServiceImpl that implements IOrderService and interacts with IOrderDAO to perform the CRUD operations.

Controller Layer:
Create a class OrderController that interacts with IOrderService and provides the following methods:
addOrder(Order order): Method for handling the addition of a new order.
retrieveAllOrders(): Method for handling the retrieval of all orders.
deleteOrder(int orderId): Method for handling the deletion of an order by its ID.
updateOrder(Order order): Method for handling the update of an order.

Main Application Class:
Create a class OrderManagementApp:
Use the Scanner class to take user input for order details.
Implement options for the following operations:
Insert a new order.
Retrieve all orders.
Delete an order by its ID.
Update order details.
Display the results in the console.*/
