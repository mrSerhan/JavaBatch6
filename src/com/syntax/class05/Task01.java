package com.syntax.class05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in);
		
		System.out.println("Pls enter your heights in inch: ");
		
		int h=scan.nextInt();
		
			if(h>=0 && h<60) {
				System.out.println("short");				
			}else if((h>=60) && (h<=72)) {
				System.out.println("medium");
			}else {
				System.out.println("tall");
			}
		
	}

}
