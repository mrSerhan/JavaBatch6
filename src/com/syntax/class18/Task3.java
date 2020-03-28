package com.syntax.class18;

public class Task3 {

//Write a program  that will have 4 different access levels of constructors and create 3 objects of this class:
//1 - inside same class; 2 - from outside the class; 3 - from different class inside different package  
//and observe result.
	
	
	Task3(){
		System.out.println("default constructor");
	}
	
	public Task3(int x) {
		System.out.println("public constructor with 1 int parameter");
	}
	
	private Task3(String s) {
		System.out.println("private constructor with 1 String parameter "+s);
	}
	
	protected Task3(String s, int x) {
		System.out.println("protected constructor with 2 parameters");
	}
	
	
	public static void main(String[] args) {
		
		Task3 obj1 = new Task3("Serhan");
		
	}

}
