package com.nit.sbeans;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	private int bookId;
	private String title;
	private String author;
	private double price;
}
