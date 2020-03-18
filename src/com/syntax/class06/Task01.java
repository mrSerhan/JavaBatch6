package com.syntax.class06;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		/* Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks
		 */

		Scanner scan;
		String language;
		String country;
		scan=new Scanner(System.in);
		System.out.println("What is your country");
		country=scan.nextLine();
	
		switch(country) {
		
		case "Turkey":
			language="Turkish";
			break;
		case "Mexico":
			language="Spanish";
			break;
		case "Usa":
			language="English";
			break;
		case "China":
			language="Chinese";
			break;
		default :
			language="Unknown";		
		}
			System.out.println("Your language is "+language);
	
	
	}

}
