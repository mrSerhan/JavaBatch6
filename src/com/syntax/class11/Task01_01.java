package com.syntax.class11;

public class Task01_01 {

	public static void main(String[] args) {
		// Create an array of cars : american, german, korean, italian. 
		// Then retrieve all values from that array using 2 different loops

		String [][] cars = { {"GMC","CHEVY", "LINCOLN"},
							{"MERCEDES","BMW","AUDI"},
							{"HYUNDAI","KIA"},
							{"FERRARI","ALFA ROMEO","BUGATTI"}
		};
		
		for (String [] car : cars) {
			for (String c : car) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("==== SECOND WAY ====");
		System.out.println();
		
		
		for ( int row = 0; row < cars.length; row++) {
			for (int col = 0; col < cars[row].length; col++) {
				System.out.println(cars[row][col]+" ");
			}
			System.out.println();
			
		}
		
	}

}
