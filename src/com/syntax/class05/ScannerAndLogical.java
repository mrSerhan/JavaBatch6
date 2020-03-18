package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main(String[] args) {
		/*  You are a salesman 
		 *  ask a user for how much his sales are 
		 *  based on the amount of sales we need to calculate his commission 
		 *  if sales is between 1 - 100 --> commission should be 10% 
		 *  if sales is between 100 and 200 --> commission should be 20% 
		 *  if sales is between 200 and 500 --> commission should be 30% 
		 *  if sales more than 500 --> commission should be 50% */

		
		Scanner scan;
		double sales;
		double commission;
		
		scan=new Scanner(System.in);
		
		System.out.println("Please enter your sales amount:");
		sales=scan.nextDouble();
		
			if(sales>=1 && sales<=100) {
				System.out.println("Based on your sales you commission is = "+(sales*0.10));
			}else if(sales>100 && sales<=200) {
				System.out.println("Based on your sales you commission is = "+(sales*0.20));			
			}else if(sales>200 && sales<500) {
				System.out.println("Based on your sales you commission is ="+(sales*0.30));
			}else {
				System.out.println("Based on your sales you commission is ="+(sales*0.50));
			}
		
		
		
	}

}
