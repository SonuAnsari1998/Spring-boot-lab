package com.nit.sbean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SessionFinder {

	@Autowired
	LocalDate date;

	public String findSeasonName() {
		int month = date.getMonthValue();

		if (month >= 3 && month <= 6) {
			return "Summer Season";
		} else if (month >= 7 && month <= 10) {
			return "Rainy Season";
		} else {
			return "Winter Season";
		}
	}
}
