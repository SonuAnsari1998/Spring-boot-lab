package com.nit.sbeans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private int id;
	private String fname;
	private String lname;
	private double salary;
	private String address;
}
