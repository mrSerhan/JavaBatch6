package com.syntax.class08;

import java.util.Scanner;

public class LoopRewiev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		double price=0.0;
		
	/*	
		do {
		System.out.println("please pay for candy");
		price=scan.nextDouble();
		} while(price!=2) ;
			System.out.println("enjoy your candy");
	*/
			
		while(price!=2) {
			System.out.println("please pay for a candy");
			price=scan.nextDouble();
		}
		System.out.println("enjoy your candy");
		
		
	}

}
