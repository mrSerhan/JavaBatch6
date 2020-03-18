package com.syntax.class12;

public class MoreStringFunctions {

	public static void main(String[] args) {
		
		String me = "I am a good tester";
		
		System.out.println(" ----- replace() FUNCTION -----");

		String newString = me.replace("a","c");
		System.out.println(newString);
		
		String newString2 = me.replace("good", "great");
		System.out.println(newString2);
		
		String car = "I have a Toyota";
		car = car.replace("Toyota","Lexus");
		System.out.println(car);
		
		System.out.println();
		System.out.println(" ----- replaceAll() FUNCTION -----");
		
		String str = "Phone number is 9726548484";
		str = str.replaceAll("[A-Za-z]","");
		System.out.println(str);
		
		String str1 = "Hello12347--&&* !!!89";
		str1 = str1.replaceAll("[0-9]", "");
				System.out.println(str1);
				
		str1 = str1.replaceAll("[^A-Za-z]", "");
		System.out.println(str1);
		
		String str2 = "Hello123^&^&^&*^!";
		str2 = str2.replaceAll("[^A-Za-z0-9]","");
		System.out.println(str2);
		
		String str3 = "Hello all students";
		str3 = str3.replaceAll(" ", "");
		System.out.println(str3);
				
		String subject = "Java";
		subject = subject.replace("a", "e").replace("J","I").toUpperCase();
		System.out.println(subject);
		System.out.println(subject.replaceFirst("E","g"));
		
	}

}
