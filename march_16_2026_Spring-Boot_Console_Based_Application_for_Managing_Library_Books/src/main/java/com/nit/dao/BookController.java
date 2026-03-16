package com.nit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.sbeans.Book;
import com.nit.service.IBookService;

@Controller
public class BookController {
	
	@Autowired
	IBookService iBookService;
	
	public void addBook(Book book) {
		iBookService.addBook(book);
		
	}
	
	public List<Book> retrieveAllBooks(){
		return iBookService.retrieveAllBooks();
		
	}
	
	public void deleteBook(int bookId) {
		iBookService.deleteBook(bookId);
		
	}
	
	public void updateBook(Book book) {
		iBookService.updateBook(book);
		
	}
	
}
