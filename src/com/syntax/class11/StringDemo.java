package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String school = "Syntax";
		
		String str = new String ("HELLO");
		
		String str1 = "This is a String";
			System.out.println();		
	System.out.println("------ LENGTH() FUNCTION ------");
			System.out.println();
		
		// how many characters String has
		System.out.println(school.length());		
		int size = str.length();
		System.out.println("String length is "+size);
				
				System.out.println();		
	System.out.println("------ TOUPPERCASE / TOLOWERCASE FUNCTION ------");
				System.out.println();	
		// convert String to lowercase or uppercase
		
		System.out.println(school.toUpperCase());
		System.out.println(str.toLowerCase());
		str = str.toLowerCase();
		System.out.println(str);
				
				System.out.println();		
	System.out.println("------ CONCAT FUNCTION ------");
				System.out.println();
		// concatinate 2 Strings
	
		String newString = str+school;
		System.out.println(newString);
		
		String day = "Saturday";
		String date = "14";
		String newDate = day.concat(date);
		System.out.println(newDate);
		
		/* ----> Below code will give compiler error
		 * since.concat() method is used to attach 1 String to another String
		char grade = 'A';
		String str2 = "Student";
		str2.concat(grade);
		*/
				System.out.println();
	System.out.println("------ isEmpty FUNCTION ------");	
				System.out.println();
		// tells true if there is no characters inside the String
		// tell false if any characters are inside the String
				
		String str3 = "";
		boolean empty = str3.isEmpty();
				System.out.println(empty);
				
				System.out.println();
	System.out.println("------ trim() FUNTION ------");	
				System.out.println();
		// Removes empty/white space at the beginning and end of the String
				
		String str4 = "    Welcome to Syntax!   ";	
		str4 = str4.trim();
		System.out.println("String with no leading or trailing spaces :"+ str4);
	}

}
