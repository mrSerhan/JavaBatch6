package com.syntax.class06;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Ask user a gender
		 * based on the gender will provide describtion 
		 */
		
		Scanner scan;
		char gender;
		String genderType;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter gender: M or F");
		gender=scan.next().charAt(0);
		
		switch(gender) {
		
		case 'M':
			genderType="Male";
			break;
		case 'F':
			genderType="Female";
			break;
		default:
			genderType="Unknown";
			
		}
			System.out.println("Your gender is "+genderType);
	}

}
