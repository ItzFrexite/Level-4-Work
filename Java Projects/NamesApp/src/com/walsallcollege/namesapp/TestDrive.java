package com.walsallcollege.namesapp;

public class TestDrive {

	public static void main(String[] args) {

		NamesHolder nh = new NamesHolder();
		boolean result = nh.findName("sally");
		
		System.out.println(result);
		
	}

}
