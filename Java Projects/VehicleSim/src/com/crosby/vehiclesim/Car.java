package com.crosby.vehiclesim;

public class Car extends Vehicle{
	
	int numberOfDoors;

	public Car(Engine engine, boolean ignition, String primaryColour, String secondaryColour, int age, String manufacturer, String model, int speed, int maxSpeed, int currentSpeed, int numberOfDoors) {
		super(engine, ignition, primaryColour, secondaryColour, age, manufacturer, model, speed, maxSpeed, currentSpeed);
		this.numberOfDoors = numberOfDoors;
	}

}
