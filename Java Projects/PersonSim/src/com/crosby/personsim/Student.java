package com.crosby.personsim;

public class Student extends Person {

	String[] subjects;
	
	public Student(String firstName, String lastName, double height, double weight, int age, String[] subjects) {
		super(firstName, lastName, height, weight, age); //pass these values to the Person class constructor
		this.subjects = subjects;
	}
	
	public void revise(String subject){
		System.out.println(firstName + " is revising for " + subject + ".");
	}
	
	public void takeExam(){
		System.out.println("I am taking an exam");
	}
	
}
