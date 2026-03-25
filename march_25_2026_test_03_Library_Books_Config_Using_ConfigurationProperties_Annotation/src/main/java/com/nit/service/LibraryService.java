package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.sbeans.Library;

@Component
public class LibraryService {
	@Autowired
	Library library;
	public void showBook() {
		List<String> bookList = library.getBooks();
		System.out.println(library.getName());
		for(String lb: bookList) {
				IO.println(lb);
		}
	}
}
