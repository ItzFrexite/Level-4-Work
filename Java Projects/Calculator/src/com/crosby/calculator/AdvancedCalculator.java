package com.crosby.calculator;

public class AdvancedCalculator extends Calculator{

	public double percent(double num1, double num2){
		double result4 = (float)(1 / num1 * num2);
		return result4;
	}
	
	public double areaOfACircle(double num1){
		double result5 = Math.PI * (num1*num1);
		return result5;
	}
	
	public double volumeOfACylinder(double num1, double num2){
		double result6 = Math.PI * num1 * num1 * num2;
		return result6;
	}
	
}
