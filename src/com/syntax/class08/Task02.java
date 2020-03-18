package com.syntax.class08;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int evenSum=0;;
		int oddSum=0;
		int i;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter two numbers");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		
		for(i=num1;i>=num2;i--) {
			if(i%2==0) {
				evenSum=evenSum+i;
				
			}		
			}
		System.out.println("even numbers total = "+evenSum);
		
		
		for(i=num1;i>=num2;i--) {
			if(i%2!=0) {
				oddSum=oddSum+i;
				
			}
			
		}
		System.out.println("odd numbers total = "+oddSum);
		
		System.out.println("even and odd numbers totals = "+(evenSum+oddSum));

	System.out.println("======================================");
	
	
	
	
	
	}

}
