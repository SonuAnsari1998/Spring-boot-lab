package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.sbeans.Student;

@SpringBootApplication
public class March172026SpringBootValueAnnotationStudentResultEvaluationSystemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(March172026SpringBootValueAnnotationStudentResultEvaluationSystemApplication.class, args);
		
		Student studentStatus = ctx.getBean(Student.class);
		
		System.out.println("Student details:\n"
				+ "Marks in each subject\n"
				+ "Math: "+studentStatus.getMath()+"\n"
				+ "Science: "+studentStatus.getScience()+" \n"
				+ "English: "+studentStatus.getEnglish()+"\n"
				+ "Result status: "+studentStatus+"");	
	}

}
