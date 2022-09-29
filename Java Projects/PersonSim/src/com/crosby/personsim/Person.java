package com.crosby.personsim;

public class Person {
	
	String firstName;
	String lastName;
	double height;
	double weight;
	int age;
	
	public Person(String firstName, String lastName, double height, double weight, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}

	public void walk(){
		System.out.println(firstName + " is walking!");
	}
	
	public void breathe(){
		System.out.println(firstName + " is breathing!");
	}
	
	public void eat(){
		System.out.println(firstName + " is eating!");
	}
	
	public void drink(){
		System.out.println(firstName + " is drinking!");
	}
	
	public void sleep(){
		System.out.println(firstName + " is sleeping!");
	}

}
