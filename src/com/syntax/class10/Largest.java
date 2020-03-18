package com.syntax.class10;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find largest element from an array
		int[] nums= {200,30,-1,900,56,787,300};
		
		int largest=nums[0];
		
		for(int i = 0; i<nums.length;i++) {
			
			if(nums[i]>largest) {
			largest=nums[i];
		}
		
	}
			System.out.println("largest num is "+largest);
}
}