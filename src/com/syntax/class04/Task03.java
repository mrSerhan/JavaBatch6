package com.syntax.class04;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Pls enter the loan amount:");

		int loan = scan.nextInt();

		System.out.println("You want " + loan + " USD.");

		if (loan < 200000) {
			System.out.println("Our bank can provide your credit " + loan + " USD");
		} else {
			System.out.println("Sorry you can try another bank for " + loan + " USD");
		}

	}

}
