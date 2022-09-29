package com.walsallcollege.expressatm;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.RequestingUserName;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import com.walsallcollege.expressatm.Account;

public class ExpressATM {

	private List<Account> accounts;
	private Account accountCurrentlyLoggedIn;
	private double accountBalance;
	
	
	public ExpressATM() {
		accounts = new ArrayList<>(); 
		accounts.add(new Account("280199", "1999", 150.00, false, 0, 1));
		accounts.add(new Account("123456", "1234", 200.00, false, 0, 2));
		accounts.add(new Account("246810", "1357", 100.00, false, 0, 3));
	}
	
	
	public boolean withdraw(String accountNum, String pin, int amount) {
		for (int i = 0; i < accounts.size(); i++) {
			accountCurrentlyLoggedIn = accounts.get(i);
			// if both are correct
			if (accountNum.equals(accounts.get(i).getAccountNumber()) && pin.equals(accounts.get(i).getPin())) {
				
				if (accountCurrentlyLoggedIn.isSuspended() == true)
				{
					System.out.println("Account is suspended");
					return false;
				}
				
				accountCurrentlyLoggedIn.setAttempts(0);
				
				if (accountCurrentlyLoggedIn.getBalance() < amount)
				{
					return false;
				} else {
					accountCurrentlyLoggedIn.setBalance(accountCurrentlyLoggedIn.getBalance() - amount);
					accountBalance = accountCurrentlyLoggedIn.getBalance();
				}
				
				return true;
			}
			// if only accountNum is correct
			if (accountNum.equals(accounts.get(i).getAccountNumber()) && !pin.equals(accounts.get(i).getPin())) {
				accountCurrentlyLoggedIn = accounts.get(i);
				if (accountCurrentlyLoggedIn.getAttempts() == 3)
				{
					accountCurrentlyLoggedIn.setSuspended(true);
					System.out.println("Account is suspended");
					return false;
				}
				accountCurrentlyLoggedIn.setAttempts(accountCurrentlyLoggedIn.getAttempts() + 1);
				System.out.println("Wrong");
				return false;
							
				
			}
			
			if (!accountNum.equals(accounts.get(i).getAccountNumber()) && !pin.equals(accounts.get(i).getPin())) {
				if (i>3)
				{
					return false;
				}
			}
		}
		return false;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void logout() {
		accountCurrentlyLoggedIn = null;
	}
	
}
