package com.nit;

import com.nit.dao.BookController;
import com.nit.sbeans.Book;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class March132026SpringBootApplication {
	private final BookController bookController;

	March132026SpringBootApplication(BookController bookController) {
		this.bookController = bookController;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(March132026SpringBootApplication.class, args);

		BookController bookController = ctx.getBean(BookController.class);
		IO.println("\nLibrary Management Application");
		IO.println("1. Insert a new book.\n" + "2. Retrieve all books.\n" + "3. Delete a book by its ID.\n"
				+ "4. Update book details.");
		int choice = Integer.parseInt(IO.readln("Enter your choice!!!\n"));

		switch (choice) {
		case 1 -> {
			int bookId = Integer.parseInt(IO.readln("Enter book id"));
			String bookTitle = IO.readln("Enter book title");
			String bookAuthor = IO.readln("Enter book author");
			double bookPrice = Double.parseDouble(IO.readln("Enter book price"));
			Book book = new Book(bookId, bookTitle, bookAuthor, bookPrice);
			bookController.addBook(book);
		}
		case 2 -> {
			List<Book> allBooks = bookController.retrieveAllBooks();
			for (Book b : allBooks) {
				IO.println(b);
			}
		}
		case 3 -> {
			int bookId = Integer.parseInt(IO.readln("Enter book id want to delete"));
			bookController.deleteBook(bookId);
		}
		case 4 -> {
			int bookId = Integer.parseInt(IO.readln("Enter book id want to update"));
			String bookTitle = IO.readln("Enter new book title");
			String bookAuthor = IO.readln("Enter new book author");
			double bookPrice = Double.parseDouble(IO.readln("Enter new book price"));
			Book book = new Book(bookId, bookTitle, bookAuthor, bookPrice);
			bookController.updateBook(book);
		}
		default -> System.err.println("Invalid choice... ");
		}

	}

}
