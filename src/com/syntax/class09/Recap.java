package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= 3; j++) {

				System.out.println(i + " " + j);

			}

		}
		System.out.println("======================================");

		// using nested loop to print 10 until 99

		for (int i = 1; i <= 9; i++) {
			for (int y = 0; y <= 9; y++) {
				System.out.println(i + "" + y);
			}

		}

		System.out.println("======================================");

		// using nested loop to print clock
		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				if (m < 10) {
					System.out.println(h + ":0" + m);

				} else {

					System.out.println(h + ":" + m);
				}
			}
		}
		System.out.println("======================================");
		//using nested loops to print car odometer
		
		for(int m1=0;m1<=9;m1++) {
			for(int m2=0;m2<=9;m2++) {
				for(int m3=0;m3<=9;m3++) {
					for(int m4=0;m4<=9;m4++) {
						System.out.println(m1+""+m2+""+m3+""+m4);
					}
					}
}
}
		
	}
}