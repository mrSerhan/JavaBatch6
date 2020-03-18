package com.syntax.class05;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest of three double values using if-else..if and
		 * logical operators provided by a user (numbers must be distinct)
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter 3 different number");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		if (a != b && a != b && b != c) {
			if (a > b && a > c) {
				System.out.println(a + " bigger than other numbers");
			} else if (b > a && b > c) {
				System.out.println(b + " bigger than other numbers");
			} else {
				System.out.println(c + " bigger than other numbers");
			}
		} else {
			System.out.println("Please enter different number from each other ");
		}
	}
}
