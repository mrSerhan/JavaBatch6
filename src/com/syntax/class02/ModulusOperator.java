package com.syntax.class02;

public class ModulusOperator {

	public static void main(String[] args) {
		
		float f=12.50f;
		float f1=2.7f;
		
		double d=12.50;
		double d1=2.7;
		
		float result=f/f1;
		double result3=d/d1;
		
		System.out.println(result);
		System.out.println(result3);
		
		int i = 12;
		int y = 7;
		
		int result1=i/y;
		double result2=i/y;
		
		System.out.println(result1);
		System.out.println(result2);	
		
		// Modulus
		
		int v=16;
		int w=3;
		
		int mod=v%w;
		System.out.println(mod);
		
		// I would like to devide 12/7
		
		// int num1=12.50; not possible to store decimals into int.
		
		double num2=12; // we can store int into double
		double num3=7;
		
		System.out.println(num2/num3);
		
		
		
	}

}
