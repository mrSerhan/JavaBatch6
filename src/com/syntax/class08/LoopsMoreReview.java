package com.syntax.class08;

public class LoopsMoreReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// to print number from 50 to 1
		
		for(int i=50; i>0;i--) {
			System.out.println(i);
		}
		
		System.out.println("*************** PRINTING ODD NUMBERS ***************");
		//print odd numbers between 20 and 50
		
		for(int j=20;j<=50;j++) {
			if(j%2!=0) {
				System.out.println(j);
			}
		}
		
		System.out.println("************************");
		// WHAT IS THE OUTPUT
		
		int total=2;
		for(int k=1; k<4; k++) {
			total=total*k;
		
			System.out.println(total);
		}
		System.out.println("Final total : " +total);
		
		// write a program calculate sum of odd and sum of even numbers
		// from 1 to 99
		
		int oddSum=0;
		int evenSum=0;
		for(int z=1;z<=99;z++) {
			if(z%2!=0) {
				oddSum=oddSum+z;
			}else {
				evenSum=evenSum+z;
			}
		}
		
		System.out.println(" sum of odd number = "+oddSum);
		System.out.println(" sum of even number = "+evenSum);
	}

}
