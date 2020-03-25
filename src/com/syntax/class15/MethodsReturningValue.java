package com.syntax.class15;

public class MethodsReturningValue {

	public static void main(String[] args) {
		// Create a String and based on the length of String
		// we define whether String in short or long
		
		String str = "Hello my friend";
		int length = str.length();
		
		if(length>10) {
			System.out.println("String is long");
		}else {
			System.out.println("String is short");
		}

		// compare 2 numbers and then we identify whether largest is even or odd
		
		Tasks obj = new Tasks();
		obj.largerOr(10,20);
		
		
		 MethodsReturningValue newObject = new  MethodsReturningValue();
		
	}

	// Create a method that returns largest number from 2 given numbers 
	int largest(int a, int b) {
		int largest;
		
		if(a>b) {
			largest = a;			
		}else {
			largest = b;
		}
		return largest;
	}
}
