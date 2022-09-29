package com.crosby.calculator;

public class TestDrive {

	public static void main(String[] args) {
		
		//Create Calculator object
		Calculator myCal = new Calculator();
		//Call the add methods and pass it 2 numbers and store the result which is returned by the add method.
		double result = myCal.add(2, 1);
		System.out.println("The result is " + result);
		
		Calculator myCal1 = new Calculator();
		double result1 = myCal1.subtract(2, 2);
		System.out.println("The result is " + result1);
		
		Calculator myCal2 = new Calculator();
		double result2 = myCal2.divide(5, 2);
		System.out.println("The result is " + result2);
		
		Calculator myCal3 = new Calculator();
		double result3 = myCal3.multiply(6, 3);
		System.out.println("The result is " + result3);
		
		AdvancedCalculator myCal4 = new AdvancedCalculator();
		double result4 = myCal4.percent(10, 70);
		System.out.println("The result is " + result4);
		
		AdvancedCalculator myCal5 = new AdvancedCalculator();
		double result5 = myCal5.areaOfACircle(15);
		System.out.println("The result is " + result5);
		
		AdvancedCalculator myCal6 = new AdvancedCalculator();
		double result6 = myCal6.volumeOfACylinder(5,4);
		System.out.println("The result is " + result6);

	}

}
