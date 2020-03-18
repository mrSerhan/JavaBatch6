package com.syntax.class05;

import java.util.Scanner;

public class HomeWork01_ext {

	public static void main(String[] args) {
		/*
		 * 
		 * Write a program that will read three inputs of scores (quiz, mid term, and
		 * final scores) and determine the grade based on the following rules: if the
		 * average score >=90 → grade=A if the average score >= 70 and <90 → grade=B if
		 * the average score>=50 and <70 → grade=C if the average score<50 → grade=F
		 */

		while (true) {
			Scanner scan = new Scanner(System.in);

			System.out.println("Please enter your quiz score :");
			double quizScore = scan.nextInt();
			if (quizScore > 0 && quizScore <= 100) {
				quizScore = quizScore;
			} else {
				System.out.println("Invalid quiz score pls enter again");
				break;
			}

			System.out.println("Please enter your mid term score :");
			double midScore = scan.nextInt();
			if (midScore > 0 && midScore <= 100) {
				midScore = midScore;
			} else {
				System.out.println("Invalid mid term score pls enter again");
				break;
			}

			System.out.println("Please enter your final score :");
			double fScore = scan.nextInt();
			if (fScore > 0 && fScore <= 100) {
				fScore = fScore;
			} else {
				System.out.println("Invalid final score pls enter again");
				break;
			}

			double average = (quizScore + midScore + fScore) / 3;
			String grade;

			if (average >= 90) {
				grade="A";
				
			} else if (average < 90 && average >= 70) {
				grade="B";
				
			} else if (average < 70 && average >= 50) {
				grade="C";
				
			} else {
				grade="F";
				
			}
			System.out.println("Your average score is "+average+" and grade is "+grade);
			break;
				
		}
		
	}
}
