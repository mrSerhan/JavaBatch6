package com.syntax.class07;

import java.util.Scanner;

public class LoopsAndScanner {

	public static void main(String[] args) {
		// we want to ask users name 5 times and print good afternoon ___;

		Scanner input=new Scanner(System.in);
		String name;
		int num=1;
		
		
		System.out.println("What is your name");
		while(num<=5) {
		name=input.nextLine();
		
		System.out.println("good afternoon "+name);
		num++;
		
		}
	}

}
