package com.syntax.class02;

public class String_Shwork {

	public static void main (String [] args) {
		
		String firstName = "Serhan";
		String lastName = "Ozgun";
		char studentGrade = 'B';
		String studentCity = "Dallas";
		String studentState = "Texas";
		long phoneNumber = 9726793494L ;
		
		studentGrade='A';
		studentState="California";
		studentCity="San Diego";
		phoneNumber=9726793494L;
		
		/*
		System.out.println("First Name : "+firstName);
		System.out.println("Last Name : "+ lastName);
		System.out.println("Student Grade : "+studentGrade);
		System.out.println("City : "+studentCity);
		System.out.println("State : "+studentState);
		System.out.println("Phone number : "+phoneNumber);
		*/
		
		System.out.println("My name is "+firstName+" and my last name is "+lastName+"."+
		" I live in city of "+studentCity+" in state "+studentState+" and my phone number is "
				+phoneNumber);
		
		
		
	}
}
