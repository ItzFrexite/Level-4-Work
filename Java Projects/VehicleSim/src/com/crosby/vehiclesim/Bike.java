package com.crosby.vehiclesim;

public class Bike extends Vehicle{

	boolean standDown;

	public Bike(Engine engine, boolean ignition, String primaryColour, String secondaryColour, int age, String manufacturer, String model, int speed, int maxSpeed, int currentSpeed, boolean standDown) {
		super(engine, ignition, primaryColour, secondaryColour, age, manufacturer, model, speed, maxSpeed, currentSpeed);
		this.standDown = standDown;
	}
	
}
