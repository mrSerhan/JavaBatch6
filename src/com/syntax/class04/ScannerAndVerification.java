package com.syntax.class04;

import java.util.Scanner;

public class ScannerAndVerification {

	public static void main(String[] args) {
		/*
		 * capture 2 number from a user Compare number and identfy which larger
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Pls enter first number");
		int num1 = input.nextInt();
		System.out.println("Pls enter second number");
		int num2 = input.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + " larger than " + num2);
		} else if (num2 > num1) {
			System.out.println(num2 + " larger than " + num1);
		} else {
			System.out.println(num1 + " is equal to " + num2);
		}

	}

}
