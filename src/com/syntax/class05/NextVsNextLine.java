package com.syntax.class05;

import java.util.Scanner;

public class NextVsNextLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner variable = new Scanner(System.in);
		 System.out.println("Pls enter any text");
		 String text1=variable.next();
		 System.out.println("Pls enter any text");
		 String text=variable.nextLine();
		 
		 
		System.out.println(text);
		System.out.println(text1);
		
		
		
	}

}
