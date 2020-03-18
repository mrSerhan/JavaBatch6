package com.syntax.class12;

import java.util.Scanner;

public class Task01_03 {

	public static void main(String[] args) {
	/* Write a program that reads two people’s first names and if they expecting
		boy or girl?
	Based on the input suggests a name for a baby:
			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? boy
			Suggested baby name: DANRY

			Example Output:
			Mom’s first name? Mary
			Dad’s first name? Daniel
			Boy or Girl? girl
			Suggested baby name: MAIEL **/

		Scanner scan = new Scanner (System.in);
		
		String dadName = null;
		String momName = null;
		String babygirlboy = null;		
		String babyName = null;
	
		
		System.out.println("Write dads name :");
		dadName = scan.nextLine();
		System.out.println("Write mom name :");
		momName = scan.nextLine();
		System.out.println("is baby girl or boy");
		babygirlboy = scan.nextLine();
		
		int dadHalf = dadName.length()/2;
		int momHalf = momName.length()/2;
		
		if(babygirlboy.equalsIgnoreCase("boy")) {
			babyName = dadName.substring(0, dadHalf) + momName.substring(momHalf);
				System.out.println(babyName);
			
		} else if(babygirlboy.equalsIgnoreCase("girl")) {			
			babyName = momName.substring(0,momHalf)+dadName.substring(dadHalf);
			System.out.println(babyName);
		}
		
	
		
		
	}

}
