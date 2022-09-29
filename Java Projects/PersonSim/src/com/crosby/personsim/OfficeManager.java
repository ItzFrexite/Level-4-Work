package com.crosby.personsim;

public class OfficeManager extends Employee{
	
	int reservedParkingSpaceID;
	
	public OfficeManager(String firstName, String lastName, double height, double weight, int age, int payrollNumber, String niNumber, String[] department, int reservedParkingSpaceID) {
		super(firstName, lastName, height, weight, age, payrollNumber, niNumber, department); //pass these values to the Person class constructor
		this.reservedParkingSpaceID = reservedParkingSpaceID;
	}
	
	public void conductAppraisal(){
		System.out.println(firstName + " goes to a Conduct Appraisal");
	}
	
	public void chairMeeting(){
		System.out.println(firstName + " goes to a chair meeting");
	}
	
	public void produceDataReport(){
		System.out.println(firstName + " goes to produce a data report");
	}

}
