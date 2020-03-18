package com.syntax.class04;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not. If you
		 * user does not have a credit card then offer them. If they do have one ask
		 * what is balance on the card? If balance of the card is larger than 1000, tell
		 * them to pay off immediately, otherwise you can tell them that they can spend
		 * more.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Do you have any credit card?  (yes or no)");
		String input = scan.nextLine();

	
		//if (input.equals("yes")) {		
		if (input.contains("yes")) {
			System.out.println("What is the balance on the card?");

			int balance = scan.nextInt();

			if (balance > 1000) {
				System.out.println("You have to pay off immediately!");
			} else {
				System.out.println("You can spend more...");
			}
		} else {
			System.out.println("We can offer our platinum credit card.");
		}
	}

}
