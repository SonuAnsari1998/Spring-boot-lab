/*Create a Spring Boot application to manage products using a console-based interface. The application will perform basic CRUD (Create, Retrieve, Update, Delete) operations on a database table named "Product".

Requirements:

Database Table Creation:
Create a database table named Product20 with the following columns:
productId (int, primary key)
productName (String)
description (String)
price (double)

Product Bean Class:
Define a Product class with the following fields:
productId (int)
productName (String)
description (String)
price (double)
Include appropriate getters and setters for all fields.

Data Source Configuration:
Configure the data source in application.properties to connect to a database.

Repository Layer:
Create a class named ProductDAO with the following methods:
insertProduct(Product product): Method to insert a new product record into the database.
List<Product> getAllProducts(): Method to retrieve all product records from the database.
deleteProduct(int productId): Method to delete a product by its ID.
updateProduct(Product product): Method to update an existing product.

Service Layer:
Create a class named ProductService that interacts with ProductDAO:
addProduct(Product product): Method to add a new product.
List<Product> retrieveAllProducts(): Method to retrieve all products.
deleteProduct(int productId): Method to delete a product.
updateProduct(Product product): Method to update an existing product.

Controller Layer:

Create a class named ProductController that interacts with ProductService:
addProduct(Product product): Method for handling the addition of a new product.
retrieveAllProducts(): Method for handling the retrieval of all products.
deleteProduct(int productId): Method for handling the deletion of a product.
updateProduct(Product product): Method for handling the update of a product.

Main Application Class:
Create a class named ProductManagementApp:
Use the Scanner class to take user input for product details.
Implement options to:
Insert a new product.
Retrieve all products.
Delete a product by ID.
Update product details.
Display the results in the console.
===================================================================================================================================================*/