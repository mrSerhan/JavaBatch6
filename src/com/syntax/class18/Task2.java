package com.syntax.class18;

public class Task2 {

//	Write a java program of Class Students that takes students name and 3 subject grades. 
//  Inside your class also have a method to Calculate Average Grade. 
//	Test Student class for 5 different students with different marks. 
//	Your program should print an average mark of each students name.
//	NOTE: please use different names for instance and local variables.

	
	String name;
	int grade1, grade2, grade3;
	
	Task2(String studentName, int studentGrade1, int studentGrade2, int studentGrade3){
		name = studentName;
		grade1 = studentGrade1;
		grade2 = studentGrade2;
		grade3 = studentGrade3;
	}
	
	public int gradeAverages() {
		int average = (grade1+grade2+grade3)/3;
		return average;
	}
	
	public static void main(String [] args) {
		
		Task2 student1 = new Task2("Serhan", 70,80, 80);
		System.out.println("Student "+student1.name+" average grade is "+student1.gradeAverages());
		
		Task2 student2 = new Task2("Ahmet", 100,80, 90);
		System.out.println("Student "+student2.name+" average grade is "+student2.gradeAverages());
	
		Task2 student3 = new Task2("Turker", 90,90,90);
		System.out.println("Student "+student3.name+" average grade is "+student3.gradeAverages());
	}
	
}
