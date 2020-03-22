package com.syntax.class14;

public class Garage {

	public static void main(String[] args) {
		
		// build individual objects
		Car car1 = new Car();
		car1.make = "Lamborghini";
		car1.model = "Gallardo";
		car1.year = 2020;
		car1.color = "Blue";
		
		Car car2 = new Car();
		car2.make = "BMW";
		car2.model = "m5";
		car2.year = 2019;
		car2.color = "pink";
		
		// print BMW
		System.out.println(car2.make);
		
		// i drive pink BMW
		System.out.println("I drive "+car2.color+" "+car2.make);

		// create bike object
		//	new Bike(); ---> cannot create an object if we dont have a class
	
		// accessing behavior / metods of Car with car1
		car1.drive();
		car1.accelerate();
		car1.makeNoise();
		car1.stop();
		
		
		Car2 anotherCar = new Car2();
		anotherCar.make = "Toyota";
		anotherCar.speed = 90;
		anotherCar.drive();
	}

}
