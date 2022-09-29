package com.crosby.vehiclesim;

public class TestDrive {

	public static void main(String[] args) {

		Engine carengine = new Engine("2L", 4);
		Engine bikeengine = new Engine("2L", 4);
		
		Car myCar = new Car(carengine, false, "Blue", "Black", 10, "Ford", "Focus", 0, 120, 0, 5);
		Car myCar1 = new Car(carengine, false, "Yellow", "Black", 5, "Ford", "Fiesta", 0, 120, 0, 5);
		Car myCar2 = new Car(carengine, false, "Red", "Black", 2, "Lamborghini", "Hurrican", 0, 230, 0, 5);
		Car myCar3 = new Car(carengine, false, "Green", "Black", 6, "Land Rover", "Evoke", 0, 200, 0, 5);
		Car myCar4 = new Car(carengine, false, "Pink", "Green", 7, "McLaren", "F1", 0, 120, 0, 5);
		Car myCar5 = new Car(carengine, false, "Blue", "Pink", 9, "Ferarri", "LeFerarri", 0, 120, 0, 5);
		
		Bike myBike = new Bike(bikeengine, false, "Yellow", "Black", 5, "Harley Davidson", "Sportster", 0, 150, 0, false);
		Bike myBike1 = new Bike(bikeengine, false, "Green", "Black", 5, "Harley Davidson", "Sportster v2", 0, 150, 0, false);
		
		Car[] carList = new Car[6];
		carList[0] = myCar;
		carList[1] = myCar1;
		carList[2] = myCar2;
		carList[3] = myCar3;
		carList[4] = myCar4;
		carList[5] = myCar5;
		
		for (int i=0;i<6;i++) 
		{
			System.out.println(carList[i]);
	    }
		
		Vehicle[] vehList = new Vehicle[4];
		vehList[0] = myCar;
		vehList[1] = myCar1;
		vehList[2] = myBike;
		vehList[3] = myBike1;
		
		for (int i=0;i<4;i++) 
		{
			System.out.println(vehList[i]);
	    }
		

		
//		myCar.vehicleInfo();
//		myCar.accelerate(10);
//		myCar.turnOnIgnition();
//		myCar.decelerate(5);
//		myCar.accelerate(15);
//		myCar.accelerate(15);
//		myCar.accelerate(20);
//		myCar.decelerate(10);
//		myCar.accelerate(5);
//		myCar.turnOffIgnition();
//		myCar.accelerate(10);
//		myCar.decelerate(10);
//		
//		//System.out.println(myCar.currentSpeed);;
//		System.out.println(" ");
//		
//		myBike.vehicleInfo();
//		myBike.accelerate(15);
//		myBike.turnOnIgnition();
//		myBike.decelerate(10);
//		myBike.accelerate(25);
//		myBike.accelerate(15);
//		myBike.accelerate(30);
//		myBike.decelerate(5);
//		myBike.accelerate(10);
//		myBike.turnOffIgnition();
//		myBike.accelerate(10);
//		myBike.decelerate(15);

	}

}
