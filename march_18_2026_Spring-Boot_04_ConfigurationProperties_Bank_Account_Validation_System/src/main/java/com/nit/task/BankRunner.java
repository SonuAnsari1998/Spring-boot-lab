package com.nit.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.sbeans.BankAccount;

@Component
public class BankRunner implements CommandLineRunner {

	@Autowired
	BankAccount bankAccount;
	
	@Override
	public void run(String... args) throws Exception {
		if(bankAccount.getBalance()>0) {
			System.out.println("\n---- Bank Account Details ----\r\n"
					+ "Account No : "+bankAccount.getAccountNumber()+"\r\n"
					+ "Name       :"+bankAccount.getHolderName()+"\r\n"
					+ "Balance    : "+bankAccount.getBalance()+"");
		}else {
			System.err.println("Error: Balance must be greater than 0");
		}
	}

}
