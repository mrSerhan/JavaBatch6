package com.syntax.class09;

public class MorePatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<5;i++) {
			for(int j=1;j<5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("==================");
		
		for(int i=1;i<5;i++) {
			for(int j=1;j<5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	
		System.out.println("=======PRINTING 5 ROWA OF 1-9===========");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<10;j++) {
				System.out.print(j);
			}
			System.out.println();
	
	}

		System.out.println("=======PRINTING PATTERN 10*10===========");
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print(j);
			}
			System.out.println();
	
	}
		System.out.println("=======PRINTING 5 ROWS OF 54321 ==========");
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	
		System.out.println("========PRINTING 5 ROWS OF 55555,44444,33333==========");
		
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=1;j--) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("================================");

		
	}
}