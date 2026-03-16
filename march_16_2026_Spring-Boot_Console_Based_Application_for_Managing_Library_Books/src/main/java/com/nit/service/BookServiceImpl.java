package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.BookDAOImpl;
import com.nit.sbeans.Book;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	BookDAOImpl bookDAOImpl;

	@Override
	public void addBook(Book book) {
		bookDAOImpl.insertBook(book);
	}

	@Override
	public List<Book> retrieveAllBooks() {
		return bookDAOImpl.getAllBooks();

	}

	@Override
	public void deleteBook(int bookId) {
		bookDAOImpl.deleteBook(bookId);

	}

	@Override
	public void updateBook(Book book) {
		bookDAOImpl.updateBook(book);

	}

}
