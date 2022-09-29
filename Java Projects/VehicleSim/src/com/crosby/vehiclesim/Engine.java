package com.crosby.vehiclesim;

public class Engine {
	
	String size;
	int numOfCyclinders;
//	
	public Engine(String size, int numOfCyclinders) {
		this.size = size;
		this.numOfCyclinders = numOfCyclinders;
	}

	public void movePistons(){
		System.out.println("The pistons are moving");
	}
	
	public void stopPistons(){
		System.out.println("The pistons have stopped");
	}

}
