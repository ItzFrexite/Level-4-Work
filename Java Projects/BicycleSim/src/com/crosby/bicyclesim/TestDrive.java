package com.crosby.bicyclesim;

public class TestDrive {

	public static void main(String[] args) {
	
		//create object using the constructor
		Bicycle mattsBike = new Bicycle("BMX", "Red", true, 200, 199, 20);
		//setup state
		//mattsBike.maxSpeed = 200;
		//mattsBike.hasGears = true;
		//execute behaviour/call methods
		mattsBike.pedal();
		mattsBike.applyBrakes();
		
		//Bicycle sarahsBike = new Bicycle();
		//sarahsBike.pedal();
	}

}
