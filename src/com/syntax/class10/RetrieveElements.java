package com.syntax.class10;

public class RetrieveElements {

	public static void main(String[] args) {
		
		char[] grades= {'A','B','C','D','E','F'};
		
		//GETTING ALL ELEMENTS
		
		for(int i=0;i<grades.length;i++) {
			System.out.print(grades[i]+" ");
		}
System.out.println();
		
		System.out.println("====PRINTING USING ADVANCED FOR LOOP====");
		
		for(char anyName:grades) {
			
			System.out.print(anyName+" ");
		}
		System.out.println(" CREATE AN ARRAY OF FRUITS AND RETRIEVE ALL ELEMENTS");	
System.out.println();
		
		String[] fruits= {"banana","kiwi","apple","mango"};
	
		//advanced for loop, enhanced for loop, for each loop	
		//if fruit is apple --> that is your favorite fruit
		for(String fruit:fruits) {
			if(fruit.equals("apple")) {
			System.out.println(fruit+" is your favorite fruite");
			}else {
				System.out.println(fruit);
			}
		}
System.out.println();
		//regular for loop
		for(int i=0;i<fruits.length;i++) {
			System.out.println(fruits[i]);
		}
		
		
	}

}
