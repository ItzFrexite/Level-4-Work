package com.crosby.overridingdemo;

public class Superman extends FlyingSuperHero{
	
	public Superman() {
		super("Superman");
	}

	public void useXratVision() {
		System.out.println(name + " is using his x-ray vision");
	}
	
	public void useHeatVision() {
		System.out.println(name + " is using his heat vision");
	}

}
