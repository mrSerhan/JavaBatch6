package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean classToday=true;
		boolean flag=true;
		
		if(flag) {
			System.out.println("hello");
			
			if (classToday) {
				System.out.println("hello friends");				
			}
			else { 
				System.out.println("hello family");
			}
		
		}
		else {
			System.out.println("Bye");
		}
		
		System.out.println("I am outside of if condition");
		
	}

}
