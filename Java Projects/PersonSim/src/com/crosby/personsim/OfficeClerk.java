package com.crosby.personsim;

public class OfficeClerk extends Employee{
	
	public OfficeClerk(String firstName, String lastName, double height, double weight, int age, int payrollNumber, String niNumber, String[] department) {
		super(firstName, lastName, height, weight, age, payrollNumber, niNumber, department); //pass these values to the Person class constructor
	}
	
	public void clockIn(){
		System.out.println(firstName + " clocks in");
	}
	
	public void clockOut(){
		System.out.println(firstName + " clocks out");
	}
	
	public void claimOverTime(){
		System.out.println(firstName + " claims overtime");
	}

}
