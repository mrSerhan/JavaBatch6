package com.syntax.class19;

public class ConstructorCall {

	public ConstructorCall() {
		System.out.println("I am non argument constructor");
	}
	
	public ConstructorCall(String str) {
		this();		
	}
	
	public ConstructorCall(String str, String str1) {
		this("Hello");
	}
	public static void main(String[] args) {
		
		ConstructorCall obj1 = new ConstructorCall("Java");
		ConstructorCall obj2 = new ConstructorCall("ser","han");
	}
	
}
