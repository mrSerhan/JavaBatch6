package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* if declare number is 
		 * between 1-10 --> this number is small
		 *between 11-100 --> this is big number
		 *between 101-1000 --> this is large number 
		 */
		
		int num=500;
		
		if(num>=1&&num<=10) {
			System.out.println("this number is small");
		}else if(num>10 &&num<=100) {
			System.out.println("this is big number");
		}else if (num>100&&num<=1000){
			System.out.println("this is a large number");
		}else {
			System.out.println("Number is super large");
		}
		
		
		
		
	}

}
