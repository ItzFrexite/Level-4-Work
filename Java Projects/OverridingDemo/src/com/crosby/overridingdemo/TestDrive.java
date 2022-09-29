package com.crosby.overridingdemo;

public class TestDrive {

	public static void main(String[] args) {
		Superman sm = new Superman();
		sm.fly();
		sm.fightCrime();
		sm.useHeatVision();
		sm.useXratVision();
		
		IronMan im = new IronMan(false);
		im.fly();
		im.fightCrime();
		im.getsInSuit();
		im.fly();
		im.getsOutOfSuit();

	}

}
