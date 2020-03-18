package com.syntax.class03;

public class CompareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double number1=10;
		double number2=10;
		
		if (number1<number2) {
			System.out.println("Number1 is larger than number2");
		}
		else if (number1>number2) {
			System.out.println("NUmber1 is smaller than number2");
		}
		else {
			System.out.println("Number is equal");
		}
System.out.println("--------------");
	
		int day=11;
		
		if(day==1) {
			System.out.println("It is monday, no class");
		}
		else if(day==2) {
			System.out.println("It is Tuesday, we have SDLC class");
		}
		else if(day==3) {
			System.out.println("It is wednesday, we have SDLC class");
		}
		else if(day==4) {
			System.out.println("It Thursday, we have review class");
		}
		else if(day==5) {
			System.out.println("It is Friday, no class");
		}
		else if(day==6) {
			System.out.println("It is Saturday, we have Java class");
		}
		else if(day==7) {
			System.out.println("It is Sunday, we have Java class");
		}		
		else  {
			System.out.println("Invalid weekday.");
		}
	
	
	}
	
	
	
	
	
	
	
	
	
	

}
