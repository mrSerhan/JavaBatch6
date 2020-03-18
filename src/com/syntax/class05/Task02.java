package com.syntax.class05;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter days number :");
		int day=scan.nextInt();
		
			if(day>=1 && day<=5) { 
				System.out.println("it is a weekday");
			}else if(day>=6 && day<=7) {
				System.out.println("it is a weekend");
			}else {
				System.out.println(" invalid day ");
			}
		
		
	}

}
