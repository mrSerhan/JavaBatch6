package com.syntax.class09;

public class Hw01 {

	public static void main(String[] args) {
		// Create an array of chars and store grades into it: A,B,C,D,E,F. 
		// Then print a grade B (use 2 different ways of creating an array).
		
		
		//firs way
		char[] array01 = new char[6];
		array01[0]='A';
		array01[1]='B';
		array01[2]='C';
		array01[3]='D';
		array01[4]='E';
		array01[5]='F';
		System.out.println(array01[1]);
		
		//second way
		
		char[] array02 = {'A','B','C','D','E','F'};
		System.out.println(array02[1]);
		
		
	}

}
