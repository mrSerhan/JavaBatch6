package com.syntax.class04;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask user to input city and temperature. Your
		 * program should convert Fahrenheit into celsius and print “The temperature is
		 * the city __ is __”
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the city:");
		String city = scan.nextLine();
		System.out.println("Please enter the temperature (in fahrenheit)");
		int fah = scan.nextInt();

		// (F − 32) * 5/9 = C
		int celc = (fah - 32) * 5 / 9;
		System.out.println("The temperature is the city " + city + " is " + celc + " celsius");

	}

}
