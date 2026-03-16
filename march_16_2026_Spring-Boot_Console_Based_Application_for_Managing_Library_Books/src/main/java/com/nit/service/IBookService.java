package com.nit.service;

import java.util.List;

import com.nit.sbeans.Book;

public interface IBookService {
	void addBook(Book book);
	List<Book> retrieveAllBooks();
	void deleteBook(int bookId);
	void updateBook(Book book);

}
