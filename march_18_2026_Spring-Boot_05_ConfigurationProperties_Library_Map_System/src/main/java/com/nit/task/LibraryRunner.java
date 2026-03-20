package com.nit.task;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.sbeans.Library;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LibraryRunner implements CommandLineRunner{
	@Autowired
	private Library library;

	@Override
	public void run(String... args) throws Exception {
		for(Map.Entry<String, String> book: library.getBooks().entrySet()) {
			System.out.println(book.getKey()+"  :  "+ book.getValue());
		}
	}	
}
