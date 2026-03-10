package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component
public class SeasonService {
	public String getSeason(int month) {
		if (month >= 3 && month <= 5) {
			return "Spring";
		} else if (month >= 6 && month <= 8) {
			return "Summer";
		} else if (month >= 9 && month <= 11) {
			return "Autumn";
		} else if ((month >= 1 && month <= 2) || month == 12) {
			return "Winter";
		} else {
			return "Invalid month! Please enter 1–12.";
		}
	}
}
