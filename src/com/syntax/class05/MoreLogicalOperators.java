package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		/*
		 * we have total 7 days a week if day is 2,3 -->SDLC class if day 6, 7 --> Java
		 * class if day 1,5 --> off day if day 4 --> review class
		 */

		int day = 7;

		//

		if (day == 2 || day == 3) {
			System.out.println("Today is SDLC Class");
		} else if (day == 6 || day == 7) {
			System.out.println("Today is JAVA");
		} else if (day == 1 || day == 5) {
			System.out.println("Today is no class it is day off");
		} else if (day == 4) {
			System.out.println("today is review class with elion");
		} else {
			System.out.println("invalid day");
		}

		System.out.println("------------- using strings ------------");

		// To compare String we use equals

		String day1 = "Saturday";

		if (day1.equals("Tuesday") || day1.equals("Wednesday")) {
			System.out.println("Today is SDLC class");
		} else if (day1.equals("Saturday") || day1.contentEquals("Sunday")) {
			System.out.println("Today is a JAVA class");
		} else if (day1.equals("Monday") || day1.contentEquals("Friday")) {
			System.out.println("Today is no Class, it is day off");
		} else if (day1.equals("Thursday")) {
			System.out.println("today is review class with elion");
		}else {
			System.out.println("invalid day");
		}
			
		
		
		
		
		}
}