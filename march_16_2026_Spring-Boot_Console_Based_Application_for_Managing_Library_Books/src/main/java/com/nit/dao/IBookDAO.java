package com.nit.dao;

import java.util.List;

import com.nit.sbeans.Book;

public interface IBookDAO {
	void insertBook(Book book);
	List<Book> getAllBooks();
	void deleteBook(int bookId);
	void updateBook(Book book); 
}
