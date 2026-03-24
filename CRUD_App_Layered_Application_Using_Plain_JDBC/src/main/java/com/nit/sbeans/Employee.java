package com.nit.sbeans;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
	private int eid;
	private String eFname;
	private String eLname;
	private double eSal;
	private String eAddress;
}
