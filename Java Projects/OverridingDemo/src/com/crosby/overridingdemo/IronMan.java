package com.crosby.overridingdemo;

public class IronMan extends FlyingSuperHero{
	
	private boolean isInSuit;
	
	public IronMan(boolean isInSuit) {
		super("IronMan");
		this.isInSuit = isInSuit;
	}

	public void getsInSuit() {
		isInSuit = true;
		System.out.println(name + " gets in his suit");
	}
	
	public void getsOutOfSuit() {
		isInSuit = false;
		System.out.println(name + " gets out of his suit");
	}
	
	@Override
	public void fly() {
		if(isInSuit == true) {
			System.out.println(name + " is flying");
		} else {System.out.println(name + " cannot fly as he is not in his suit");}
	}
	

}
