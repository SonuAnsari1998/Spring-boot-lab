package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component
public class DiscountService {
	public double applyDiscount(double price, double discountPercentage) {
		double  discount= (discountPercentage*price)/100;
		double finalPrice = price-discount;
		System.out.println("Discount Amount: "+discount);
		return finalPrice;
	}
}
