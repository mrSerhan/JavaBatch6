package com.syntax.class06;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		 * should print which grade was entered by a user with explanation.
		 */

		Scanner scan;
		char grade;
		String level;

		scan = new Scanner(System.in);

		System.out.println("Enter your grade");
		grade = scan.next().charAt(0);

		switch (grade) {

		case 'A':
			level = "Excelent";
			break;

		case 'B':
			level = "Good";
			break;

		case 'C':
			level = "Average";
			break;

		case 'D':
			level = "Bad";
			break;

		default:
			level = "Unknown";

		}
			System.out.println("Your level is "+level);
	}

}
