package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//NOT  - reverse the condition	
		
	boolean b=!true;
	boolean val=!false;
	
	System.out.println(b);
	System.out.println(val);
	
	boolean isCold=true;
	if(!isCold) {
		System.out.println("hello");
	}else {
		System.out.println("bye");
	}
	
	String day1="Monday";
	
	
	//if it is not monday or friday --> Find me at syntax
	
	if(!(day1.equals("Monday") && day1.equals("Friday"))) {
		System.out.println("Find me at Syntax");
	}
	
	
	
	
	}
}
