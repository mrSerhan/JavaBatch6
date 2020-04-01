package com.syntax.class19;

public class Student {
//  Write program as a Student class   that has instance variables name and address. 
//	Create a constructor that will initialize those variables. 
//	Print name & address of given  student using displayInfo method.
	
	
	String name, adress;
	
	Student(String name, String adress){
		this.name = name;
		this.adress = adress;
	}
	
	public void displayInfo() {
		System.out.println("Student name is "+name+" and adress is "+adress);
	}
	
	public static void main(String[] args) {
		
		Student obj = new Student("Serhan", "8236 Mura dr Plano Tx");
		obj.displayInfo();
	}
}
