package com.nit.sbeans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentRunner implements CommandLineRunner {

	@Autowired
	Student student;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Student Details:\n");
		IO.println("Id: " + student.getId());
		IO.println("Name: " + student.getName());
		IO.println("Cource: " + student.getCourse());

		// Array
		System.out.println("Hobbies:");
		for (String hobbies : student.getHobbies()) {
			IO.println(hobbies);
		}

		// List
		System.out.println("\nSubjects:");
		for (String subjects : student.getSubjects()) {
			IO.println(subjects);
		}

		// Set
		System.out.println("\nSubjects:");
		for (String certifications : student.getCertifications()) {
			IO.println(certifications);
		}

		// Map
		System.out.println("\nSubjects:");
		for (Map.Entry<String, Integer> entry : student.getMarks().entrySet()) {
			IO.println(entry.getKey() + " : " + entry.getValue());
		}

		// Address Object
		System.out.println("Subjects:");
		IO.println(student.getAddress().getCity());
		IO.println(student.getAddress().getState());
		IO.println(student.getAddress().getPincode());
	}

}
