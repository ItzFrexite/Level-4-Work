package com.crosby.bicyclesim;

public class Bicycle {

	String type;
	String primaryColour;
	boolean hasGears;
	int maxSpeed;
	int currentSpeed;
	int currentGear;
	
	//Constructor
	public Bicycle(String type, String primaryColour, boolean hasGears, int maxSpeed, int currentSpeed, int currentGear){
		this.type = type;
		this.primaryColour = primaryColour;
		this.hasGears = hasGears;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
		this.currentGear = currentGear;
	}
	
	public void pedal(){
		System.out.println("The bike is moving!");
	}
	
	public void applyBrakes(){
		System.out.println("The bikes brakes have been applied!");
	}
	
	public void changeGear(){
		System.out.println("The bikes gear has been changed!");
	}
	
}
