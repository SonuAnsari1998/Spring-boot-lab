package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Library {
	@Value("${book.bookName}")
	private String bookName;
	
	@Value("${book.numberOfLateDays}")
	private int numberOfLateDays;
	
	@Value("${book.finePerDay}")
	private double finePerDay;
	
	private double totalFine;

	public String toString() {
		totalFine = numberOfLateDays * finePerDay;
		return "Book Details:\r\n"
				+ "Book name: "+this.bookName+"\r\n"
				+ "Late days: "+numberOfLateDays+"\r\n"
				+ "Fine per day: "+finePerDay+"\r\n"
				+ "Total fine amount: "+totalFine+"";
	}
}
