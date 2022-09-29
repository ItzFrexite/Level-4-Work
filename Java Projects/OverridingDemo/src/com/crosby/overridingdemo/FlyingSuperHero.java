package com.crosby.overridingdemo;

public class FlyingSuperHero {
	
	String name;

	public FlyingSuperHero(String name) {
		super();
		this.name = name;
	}

	public void fightCrime() {
		System.out.println(name + " is fighting crime");
	}
	
	public void fly() {
		System.out.println(name + " is flying");
	}
	
}
