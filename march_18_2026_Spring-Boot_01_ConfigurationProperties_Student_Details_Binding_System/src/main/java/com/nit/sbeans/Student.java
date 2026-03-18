package com.nit.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties
public class Student {
	private int id;
	private String name;
	private String course;
	private double fee;
	
	public String toString() {
		return "---- Student Details ----\r\n"
				+ "ID      : "+this.id+"\r\n"
				+ "Name    : "+this.name+"\r\n"
				+ "Course  : "+this.course+"\r\n"
				+ "Fee     : "+this.fee+"";
	}
}
