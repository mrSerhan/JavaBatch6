package com.syntax.class12;

public class Task02_02 {

	public static void main(String[] args) {
		// Create a String that should be combination of letters, 
		// numbers and special characters. Find out how many alpha characters 
		// are there in the String.

		String str = "Monday82^&as!";
		str = str.replaceAll("[^A-Za-z]","");
		System.out.println(str.length());
		
		
	}

}
