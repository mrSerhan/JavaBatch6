package com.syntax.class01;

public class VariableDeclaration {

	public static void main(String[] args) {
		// create a variable and store value 
		//1. declaring a variable and assigning a value
		
		boolean b=true;
		
		//2. way 1 step --> declare variable
		//		 2 step --> assing value
		
		int i;
		i=100;
		
		// declare multiple variables and assign value later
		
		char x,y,z;
		x='A';
		y='^';
		z='0';
		z='#'; //reassigning the value
		
		// we can not have variables with same name in 1 program
		//double i=12.99; --> java will complain
		
		double ii=12.99;
		
		System.out.println(z);
	}

}
