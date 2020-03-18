package com.syntax.class07;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		
		// hello 5 times
		int num=11;
		
		while(num<=5) {
			System.out.println("hello");
			num++;
		}
		System.out.println("======= USING DO WHILE LOOP ==========");

		// hello 5 times
		int num1=11;
		do {
			System.out.println("hello");
			num1++;
		}while(num<=5);
		
	}

}
