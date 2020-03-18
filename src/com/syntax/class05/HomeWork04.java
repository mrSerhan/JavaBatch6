package com.syntax.class05;

import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter 3 different number");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int largest=0;
	
	if ((a != b) && (a != b) && (b != c)) {	
		if (a > b) {
			if (a > c) {
				largest=a;
			}

		} else if (b > c) {
			if (b > a) {
			largest=b;
			}
		} else {
			largest=c;
		}
			System.out.println("Largest number is "+largest);
		
	}else {
		System.out.println("Please enter different number from each other ");
	}
	}
}
