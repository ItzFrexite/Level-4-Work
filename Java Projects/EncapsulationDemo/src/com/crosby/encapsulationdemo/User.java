package com.crosby.encapsulationdemo;

public class User {
	
	private String firstName;
	private String surname;
	private int age; //age of the user must be between 16 and 18
	
	public User(String firstName, String surname, int age) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		
		boolean result = setAgeIfValid(age);
		if(result == true)
		{
			this.age = age;
		}else {
			throw new IllegalArgumentException("Invalid age argument");
		}
	}
	
	//setter method for the firstName variable
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public boolean setAgeIfValid(int age) {
		if(age >= 16 && age <=18)
		{
			this.age = age;
			return true; //return true and ignore any remaining code
		}
		return false;
	}
	
	//getter method for the firstName variable
	public String getFirstName() {
		return firstName;
	}
	public String getSurname() {
		return surname;
	}
	public int getAge() {
		return age;
	}
	
}
