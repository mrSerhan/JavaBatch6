package com.syntax.class10;

public class Task02 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the 
		//sum of all integer elements in an array.

		int[] num= {5,8,23,45,22};
		int sum=0;
		for(int i:num) {
			sum+=i;
		
		}
		System.out.println("sum of all integer "+sum);
		
	}

}
