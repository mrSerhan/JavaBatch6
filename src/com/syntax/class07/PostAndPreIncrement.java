package com.syntax.class07;

public class PostAndPreIncrement {

	public static void main(String[] args) {
		
		
		// ++, --
		//preincrement ++y, postincrement y++
		
		int z;
		int y=10;
		z=y++;
		System.out.println(z);
		
		int w;
		int x=10;
		w=++x;
		System.out.println(w);
		
		int num1=1;
		while(num1<5) {
			System.out.println(++num1);			
		}
		
		int num2=1;
		while(num2<5) {
			System.out.println(num2++);
		}
	}

}
