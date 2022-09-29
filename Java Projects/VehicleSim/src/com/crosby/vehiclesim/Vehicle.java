package com.crosby.vehiclesim;

public class Vehicle {
	
	Engine engine;
	boolean ignition;
	String primaryColour;
	String secondaryColour;
	int age;
	String manufacturer;
	String model;
	int speed = 0;
	int maxSpeed;
	int currentSpeed;
	
	public Vehicle(Engine engine, boolean ignition, String primaryColour, String secondaryColour, int age, String manufacturer, String model, int speed, int maxSpeed, int currentSpeed){
		this.engine = engine;
		this.ignition = ignition;
		this.primaryColour = primaryColour;
		this.secondaryColour = secondaryColour;
		this.age = age;
		this.manufacturer = manufacturer;
		this.model = model;
		this.speed = speed;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
	}
	
	@Override
	public String toString() {
		return "Vehicle info {manufacturer: " + manufacturer + ", model: " + model + ", colour: " + primaryColour + ", age: " + age + "}";
	}
	
	/*public void vehicleInfo(){
		System.out.println("Vehicle info {manufacturer: " + manufacturer + ", model: " + model + ", colour: " + primaryColour + ", age: " + age + "}");
	}*/
	
	public void turnOnIgnition(){
		ignition = true;
		engine.movePistons();
	}
	
	public void turnOffIgnition(){
		ignition = false;
		engine.stopPistons();
	}

	public void accelerate(int val){
		
		if (ignition == true){
			if(speed + val <= maxSpeed){
				speed = speed + val;
				System.out.println("The " + model + " has accelerated by " + val + " mph and is now running at " + speed + " out of a total speed of " + maxSpeed);
			}else 
			{
				System.out.println("This vehicle cannot go any faster");
			}
		} else {System.out.println("The vehicle ignition is off");}
	}
	
	public void decelerate(int val){
		if (ignition == true){
			if (speed - val >= 0)
			{
				speed = speed - val;
				System.out.println("This vehicle cannot go any slower");
			} else {
				System.out.println("The "  + model + " has decelerated by " + val + " mph and is now running at " + speed + " out of a total speed of " + maxSpeed);
			}
		}
	}

}
