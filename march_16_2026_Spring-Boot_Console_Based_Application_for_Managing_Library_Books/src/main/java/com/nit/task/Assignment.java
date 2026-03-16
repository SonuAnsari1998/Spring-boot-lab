/*Q1)
----
Spring Boot Console-Based Application for Managing Library Books
Console_Based_Application_for_Managing_Library_Books

Requirements:

Database Table Creation:
Create a database table named Book with the following columns:
bookId (int, primary key)
title (String)
author (String)
price (double)

Book Bean Class:
Define a Book class with the following fields:
bookId (int)
title (String)
author (String)
price (double)
Include appropriate getters and setters for all fields.

Data Source Configuration:
Configure the data source in application.properties to connect to a database.

Create an interface IBookDAO with the following methods:
insertBook(Book book): Method to insert a new book record into the database.
List<Book> getAllBooks(): Method to retrieve all book records from the database.
deleteBook(int bookId): Method to delete a book by its ID.
updateBook(Book book): Method to update an existing book record.

Create a class BookDAOImpl that implements the IBookDAO interface and provides the actual implementation for the methods.

Service Layer:
Create an interface IBookService with the following methods:
addBook(Book book): Method to add a new book.
List<Book> retrieveAllBooks(): Method to retrieve all books.
deleteBook(int bookId): Method to delete a book by its ID.
updateBook(Book book): Method to update a book.

Create a class BookServiceImpl that implements IBookService and interacts with IBookDAO for performing CRUD operations.

Controller Layer:
Create a class BookController that interacts with IBookService and provides the following methods:
addBook(Book book): Method for handling the addition of a new book.
retrieveAllBooks(): Method for handling the retrieval of all books.
deleteBook(int bookId): Method for handling the deletion of a book by its ID.
updateBook(Book book): Method for handling the update of a book.

Main Application Class:
Create a class LibraryManagementApp:
Use the Scanner class to take user input for book details.
Implement options for the following operations:
Insert a new book.
Retrieve all books.
Delete a book by its ID.
Update book details.
Display the results in the console.*/


