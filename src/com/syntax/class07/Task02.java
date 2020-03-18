package com.syntax.class07;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Scanner scan = new Scanner(System.in);

		
		System.out.println("please enter your number between 1-20.");
		int num=scan.nextInt();
		while (num <= 20) {

			if (num != 17) {
				System.out.println("pls try again");
				num = scan.nextInt();
			

			} else {
				System.out.println("you are lucky");

				break;

			}

		}	*/
		
		Scanner scan;
		int number;
		int luckyNumber=17;
		scan=new Scanner(System.in);
		
		do {
			System.out.println("pls enter number from 1 to 20");
			number=scan.nextInt();
			
		}while(number!=luckyNumber);
			System.out.println("You got it.");
	}
}
