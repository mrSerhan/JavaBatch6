package com.syntax.class05;

import java.util.Scanner;

public class HumanExampleImproved {

	public static void main(String[] args) {
		/* * Take age input from a user and then based on the age print output if age from 
		 * * 0-3 --> you are a baby if age from 4-5 --> you are a kid if age from 6-12 --> 
		 * * you are a child if age from 13-19 --> you are teenager if age from 20-64 --> 
		 * * you are an adult if age is more or equal to 65 --> you are a senior */

		Scanner scan=new Scanner(System.in);

		System.out.println("please enter your age :");
		int age=scan.nextInt();
		String human;
		
		
			if(age<3) {
				human="baby";
			}else if(age>=3 && age<=6) {
				human="kid";
			}else if(age>=7 && age<=12) {
				human="child";
			}else if(age>=13 && age<=19) {
				human="teenager";
			}else if(age>=20 && age<65) {
				human="adult";
			}else {
				human="senior";
			}
		
		System.out.println("you are "+human);
			
			if(human.equals("teenager")) {
				System.out.println("Parents good luck");
			}
	}

}
