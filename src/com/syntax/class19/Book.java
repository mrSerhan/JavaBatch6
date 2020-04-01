package com.syntax.class19;

public class Book {
//	Write program as a Book class   that will have instance variables 2 Constructors. While creating an object make sure:
//	Instance variables are being initialized
//	Both Constructors are being executed

	String book1, book2;
	
	Book(){
		System.out.println("these are nice books");
	}
	
	Book(String book1,String book2){
		
		this();
	}
	
	
	public static void main(String[] args) {
		
		
		Book obj = new Book("JavaBook","c++ book");
		
	}
	
	
}
