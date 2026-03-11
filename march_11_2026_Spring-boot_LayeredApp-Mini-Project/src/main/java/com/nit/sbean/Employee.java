package com.nit.sbean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	String id;
	String fname;
	String lname;
	String sal;
	String add;
}
