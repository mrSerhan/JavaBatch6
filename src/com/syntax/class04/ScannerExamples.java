package com.syntax.class04;

import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) {
		// capture name from user and
		//print in the format
		//my name is _____
		
		
		//Bring Scanner class into a program
		//System.in --> identifies keyboard		
		Scanner scan = new Scanner(System.in);
		
		//Instruct user of what program expect
		System.out.println("Pls enter your name:");
		//Capture line of Strings from user
		String name=scan.nextLine();
		

		System.out.println("How old are you?");
		int age=scan.nextInt();
		System.out.println("Your name is "+name+" and your age is "+age);
		
		
	}

}
