package com.syntax.class10;

public class Hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [][] names= {{"Mr ","Mrs ","Ms ","Miss "},
							{"Smith","Jordan","Jackson","Obama"}
							};
		System.out.println(names[0][1]+names[1][0]);
		System.out.println(names[0][0]+names[1][3]);
		System.out.println(names[0][2]+names[1][2]);
		System.out.println(names[0][3]+names[1][1]);

		String [][] students= {{"Serhan","Ebru","Kaan","Efe"},
								{"A","B","C","D"}
		};
		
		System.out.println(students[0][0]+" 's grade is "+students[1][0]);
		System.out.println(students[0][1]+" 's grade is "+students[1][1]);
	}

}
