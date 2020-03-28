package com.syntax.class17;

public class Task1 {
/*
 * Create a method that will accept an array as parameters and will return a sum of all elements 
 * from that array. Method should be visibly only within same package and accessible by the 
 * creating an instance of the class.
*/
	
	protected int sumArray(int[] arr) {
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum+=arr[i];			
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5,10,15,20};
		
		Task1 sum = new Task1();
		sum.sumArray(arr);
		System.out.println("Sum of array is = "+sum.sumArray(arr));
	}
	
}
