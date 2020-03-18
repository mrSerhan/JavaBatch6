package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//			  0	    1    2    3    -->index
		int [] num1= {10 , 20 , 30 , 40}; //-->elements
		
		
		//declare an array and initialize it and store values
		
		int[] array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
				
		//access elements from any array
		
		System.out.println( array[1]);
		
		//SECOND WAY 
		
		String[] carArray; //Preferred way
		String carArray1[];
		
		//	Storing elements into array
		carArray=new String[3];
		
		carArray[0]="bmw";
		carArray[1]="honda";
		carArray[2]="toyota";
		
		// 	I am driving toyota
		System.out.println("I am drivin "+carArray[2]);
		
		////////////////////////////////////////
		
		int[] numbers=new int[3];
		numbers[0]=100;
		numbers[1]=200;
		numbers[2]=300;
		// Change value of numbers1
		numbers[1]=2000;
		System.out.println(numbers[1]+numbers[0]); //2100
		
		
		
		
		
	}

}
