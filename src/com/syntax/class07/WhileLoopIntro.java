package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//how to print number from 5 to 15 all in 1 line?
		
		int num2=5;
		while(num2<=15) {
			System.out.print(num2+" ");
			num2++;
		}
		
		System.out.println("------------------------");
		
		//how to print values from 10 to 1?
		int num3=10;
		while(num3>=1) {
			System.out.println(num3);
			num3--;	
		}
		
		
		System.out.println("------------------------");
	
		//how to print values from 50 to 1?
		int num4 = 50;
		while (num4 >= 1) {
			System.out.println(num4);
			num4--;
		}
		//how to print odd numbers from 1 to 20?
		
		System.out.println("------------------------");
		int num5 = 1;
		while (num5 <= 20) {
			System.out.println(num5);
			num5 += 2;
		}

		//other way
		
		int num6=1;
		while(num6<=20) {
			System.out.println(num6+=2);
		}
	}

}
