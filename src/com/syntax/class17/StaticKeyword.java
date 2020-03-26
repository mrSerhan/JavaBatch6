package com.syntax.class17;

public class StaticKeyword {

	//create a template for a Phone
	
	String color;
	int memory;
	
	static String brand;
	static boolean touchScreen;
	
	// return type, name, parameters
	static void displayGeneralInfo() {
		System.out.println("We are building "+ brand + " with touch screen = "+touchScreen);
	}
	
	// Instance members of the class can access ALL STATIC members
	 void displaySpecifications() {
		System.out.println("We build phone with "+ memory + "GB in "+color+" color");
	}
	
	 //STATIC METHODS CANNOT ACCESS NON STATIC MEMBERS OF THE CLASS
//	 static void displaySpecifications() {
//	 System.out.println("We build phone with "+ memory + "GB in "+color+" color");
//	}
	
	public static void main(String [] args) {
		// accessing static variables in static way
		brand = "Iphone";
		touchScreen = true;
		
		// accessing instance variables through the instance of the class
		StaticKeyword obj = new StaticKeyword();
		obj.color = "grey";
		obj.memory = 64;
		
		// accessing static method in in a static way
		displayGeneralInfo();
		
		// accessing static method in non static way/through instance
		obj.displaySpecifications();
	}
}
