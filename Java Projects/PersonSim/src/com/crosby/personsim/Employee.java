package com.crosby.personsim;

public class Employee extends Person {
	
	int payrollNumber;
	String niNumber;
	String[] department;
	String idNumber;
	
	public Employee(String firstName, String lastName, double height, double weight, int age, int payrollNumber, String niNumber, String[] department) {
		super(firstName, lastName, height, weight, age); //pass these values to the Person class constructor
		this.payrollNumber = payrollNumber;
		this.niNumber = niNumber;
		this.department = department;
		this.idNumber = idNumber;
	}
	
	public void performJob(String department){
		System.out.println(firstName + " is in the depertment " + department + ".");
	}

}
