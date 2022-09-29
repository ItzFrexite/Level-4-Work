package com.walsallcollege.expressatm;

public class Account {


	private String accountNumber;
	private String pin;
	private Double balance;
	private boolean suspended;
	private int attempts;
	static int num;

	public Account(String accountNumber, String pin, Double balance, boolean suspended, int attempts, int num) {
		super();
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = balance;
		this.suspended = suspended;
		this.attempts = attempts;
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getAttempts() {
		return attempts;
	}

	public void setAttempts(int attempts) {
		this.attempts = attempts;
	}

	public boolean isSuspended() {
		return suspended;
	}

	public void setSuspended(boolean suspended) {
		this.suspended = suspended;
	}

	public Double getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getPin() {
		return pin;
	}

	public boolean isLoggedIn() {
		return false;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}