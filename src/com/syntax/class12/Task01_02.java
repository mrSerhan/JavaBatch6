package com.syntax.class12;

import java.util.Scanner;

public class Task01_02 {

	public static void main(String[] args) {
		
	//	Create a String and if the String is not empty perform the following: 
	//	if the String has an odd number of characters and has 3 or more 
	//	characters, print the character in the middle of the String.
		
		
		Scanner scan = new Scanner(System.in);
		
		String str = null;
		System.out.println("Enter a String value");
		str = scan.nextLine();
		
		if(!str.isEmpty()) {
			if((str.length() %2 == 1) && (str.length()>=3)) {
			System.out.println(str.charAt(str.length()/2));
		}
		}
	}

}
