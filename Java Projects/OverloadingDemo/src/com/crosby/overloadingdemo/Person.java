package com.crosby.overloadingdemo;

public class Person {
	private String firstName;
	private String surname;
	private String middleName;
	
	public Person(String firstName, String surname, String middleName) {
		super();
		this.firstName = firstName;
		this.surname = surname;
		this.middleName = middleName;
	}

	public Person(String firstName, String surname) {
		super();
		this.firstName = firstName;
		this.surname = surname;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	
	
	
}
