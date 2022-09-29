package com.crosby.encapsulationdemo;

public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//create a user object
		//set the value of each variable in the object (3 lines of code)
		//print out to the console the values of the variables in the object
		
		User myUser = new User("John", "Smith", 16);
		System.out.println(myUser.getFirstName() + " " + myUser.getSurname() + " is " + myUser.getAge() + " years old.");
		boolean result = myUser.setAgeIfValid(15);
		if(result == true) {
		System.out.println(myUser.getFirstName() + " " + myUser.getSurname() + " is " + myUser.getAge() + " years old.");
		} else {
			System.out.println("Could not change the age variable. " + myUser.getFirstName() + " is still " + myUser.getAge() + ".");
		}
	}

}
