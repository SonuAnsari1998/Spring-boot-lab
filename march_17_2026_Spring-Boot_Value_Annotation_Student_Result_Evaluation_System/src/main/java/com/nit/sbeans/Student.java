package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Student {
	@Value("${student.StudentName}")
	private String StudentName;
	
	@Value("${student.math}")
	private double math;
	
	@Value("${student.sciencce}")
	private double science;
	
	@Value("${student.english}")
	private double english;
	
	private double totalMarks;
	private double avgMarks;

	public String toString() {
		totalMarks = math + science + english;
		avgMarks = totalMarks / 3;
		
		System.out.println("Total Marks: "+this.totalMarks);
		System.out.println("Avg marks: "+this.avgMarks);
		
		if (math >= 35 && science >= 35 && english >= 35) {
			return "PASS";
		} else {
			return "FAIL";
		}
	}
}
