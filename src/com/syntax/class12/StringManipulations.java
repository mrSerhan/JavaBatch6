package com.syntax.class12;

public class StringManipulations {

	public static void main(String[] args) {
		
		String str = "Good Morning Students!";
		char letter1 = str.charAt(0);
		System.out.println(letter1);
		
		char letter5 = str.charAt(4); 
		System.out.println("letter at index 4 is " + letter5);
		
		// get all characters 1 by 1 from String
		char letter;
		for(int i = 0; i<str.length(); i++) {
			letter = str.charAt(i);
			System.out.print(letter+" ");		
		}

		System.out.println();
		System.out.println("----- indexOf -----");
		
		String name = "Syntax Technologies";
		int index = name.indexOf("y");
		System.out.println(index);
		
		index = name.indexOf(" ");
		System.out.println(index);
		
		index = name.indexOf("Syntax");
		System.out.println(index);
		
		index = name.indexOf("!");
		System.out.println("Index of not existing character "+index);
		
		index=name.indexOf("Technologies");
		System.out.println(index);
		
		index = name.indexOf("o");
		System.out.println("index of first o = "+index);
		
		
	}

}
