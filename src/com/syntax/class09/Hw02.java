package com.syntax.class09;

public class Hw02 {

	public static void main(String[] args) {
	// Create an array of names and store all names of your group. 
	// Then print your name from that array. (use 2 different ways of creating an array).

		
		//first way
		
		String[] array01;
		array01=new String[6];
		
		array01[0]="serhan";
		array01[1]="ahmet";
		array01[2]="medine";
		array01[3]="gulbahar";
		array01[4]="servet";
		array01[5]="cigdem";
		
		System.out.println(array01[0]);
		
		//second way
		
		String[] array02= {"serhan","ahmet","medine","gulbahar","servet","cigdem"};
		System.out.println(array02[0]);
		
		
	}

}
