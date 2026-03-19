package com.nit.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.sbeans.Company;
import com.nit.sbeans.Department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyRunner implements CommandLineRunner{

		@Autowired
		Company company;
		
	@Override
	public void run(String... args) throws Exception {
		
		for(Department de: company.getDepartments()) {
				System.out.println(de.getDeptId());
				System.out.println(de.getDeptName());
		}
	}
	
}
