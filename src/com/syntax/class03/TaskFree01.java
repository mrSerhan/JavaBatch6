package com.syntax.class03;

import java.util.Scanner;

public class TaskFree01 {

	public static void main(String[] args) {
		
		/* credit score 0-100 --> You are not qualified
		   credit score 101-200   $5000
		   credit score 201-300   $10000
		   credit score 301-400   $50000
		   credit score 401-500   $100000
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pls enter the your credit score:");
		
		int k = scan.nextInt();
		
		
		
		
		if ((k>=0)&&(k<=100)) {
			System.out.println("You are not qualified. Try again later.");
		}
		else if ((k>100)&&(k<=200)) {
			System.out.println("You can get $5.000 credit.");
		}
		else if ((k>200)&&(k<=300)) {
			System.out.println("You can get $10.000 credit.");
		}
		else if ((k>300)&&(k<=400)) {
			System.out.println("You can get $50.000 credit.");
		}
		else if ((k>400)&&(k<=500)) {
			System.out.println("You can get $100.000 credit." );
		}
		else {
			System.out.println("Your credit score must be between 0 and 500. Please try again.");
		}
		
		
		
		}

}
