package com.syntax.class17;

public class Task2 {
//Create a method that will take a String as a parameter and returns reverse String.
//Method should be available to all classes within your projects and accessible by class name.
	
	public static String reverseString(String str) {
		
		String reverse = "";
		for(int i = str.length()-1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
		return reverse;
	}
	
	
	public static void main(String [] args) {
		
		reverseString("serhan");
		
		
	}
	
	
}
