package com.walsallcollege.debugdemo;

public class TestDrive {

	public static void main(String[] args) {

		String fName = "joe";
		String sName = "bloggs";
		//Create username by joining the first character of fName to sName
		String username = fName.charAt(0) + sName; 
		String password = "letmein";

		if(username == "jbloggs" && password == "letmein"){
			System.out.println("Welcome back " + fName + "!");
		}else {
			System.out.println("Invalid username and/or password");
		}
	
	}

}
 