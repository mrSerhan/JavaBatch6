package com.syntax.class04;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean hasDiploma=true;
		double gpaScore=3.15;
		
		if (hasDiploma) {
			System.out.println("Congratulations, pls tell your gpa score");
			if(gpaScore>=3.5) {
				System.out.println("you are eligible for scholarship.");
			}
			else {
				System.out.println("you should have studied harder");
			}
			
			
		}
		
		else {
			System.out.println("get a degree");
		}
	}

}
