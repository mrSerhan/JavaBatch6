package com.syntax.class10;

import com.sun.tools.sjavac.server.SysInfo;

public class TwoDimansionalArray02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] nums= { 
						{10,20,30,40},
						{5,10,15,20},
						{1,2,3,4}
					};
		System.out.println(nums[2][3]);
		System.out.println(nums[0][2]);
		System.out.println();
		System.out.println("=========================");
		System.out.println();
		
		String [][] month= {
				{"January","February","December"},
				{"March","April","May"}
		};
		
		System.out.println(month[0][1]);
		
		
	}

}
