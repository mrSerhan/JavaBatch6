package com.syntax.class04;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner imputAge=new Scanner(System.in);
		
		System.out.println("Pls enter your age for driver licence.");
		int age=imputAge.nextInt();
		System.out.println("Your age is "+age+" so");
		
		if(age>18) {
			System.out.println("You can get a driver license.");
		}else {
			System.out.println("You can get only learners permit.");
		}
		
		
	}

}
