package com.syntax.class15;

public class CreatingMethods {

	// we want to create a method that will accept marks (90,80)
	// based on the marks it will return grade (A,B,C)
	// if grade > 90 -->A, if 90<grade<80 --> B, if 80<grade<70 --> C
	
	char gradeCheck (int a) {
		char grade ;
		if(a>=90) {
			grade = 'A';
			
		}else if(90>a && a>=80) {
			grade = 'B';
		}else if(80>a && a>=70) {
			grade = 'C';
		}else {
			grade = 'F';
		}
		return grade;
	
	}
	
	public static void main (String [] args) {
		CreatingMethods obj = new CreatingMethods();
		char g = obj.gradeCheck(85);
		System.out.println(g);

		System.out.println(obj.gradeCheck(65));
		
		// if grade is A or B --> good job, otherwise -->study more
		
		if (g == 'A' || g == 'B') {
			System.out.println("Good job");
		}else {
			System.out.println("please study more");
		}
	
	}
	
}
