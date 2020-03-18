package com.syntax.class11;

public class Task01_02 {

	public static void main(String[] args) {
		// Create an array of countries: north america countries, 
		//south america countries, europe countries, asian countries, 
		//african countries. Then print all values from that array using 
		//2 different loops and calculate how many total countries been stored.

		
		String [][] countries = { {"USA","Canada","Mexico","Cuba"},
								{"Argentina","Bolivia","Brazil","Chile"},
								{"Germany","Italy","France","England"},
								{"China","Russia","Korea"},
								{"Kenya","Gana","Nigeria","Egypt","Tunis"}
		};
		int counter = 0;
		
		for(String [] countrie : countries) {
			for (String c : countrie) {
				System.out.println(c+" ");
				counter ++;
			}
			System.out.println();			
		}
		System.out.println("total stored country = "+counter);
		counter = 0;
		
		System.out.println();
		System.out.println("===== SECOND WAY =====");
		System.out.println();
		
		for(int i = 0; i < countries.length; i++) {
			for (int j = 0; j < countries[i].length; j++) {
				System.out.println(countries[i][j]+" ");
				counter ++;
			}
			System.out.println();
		}
		System.out.println("total stored country = "+counter);
	}

}
