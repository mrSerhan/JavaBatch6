package com.syntax.class09;

import com.sun.tools.sjavac.server.SysInfo;

public class MoreArray {

	public static void main(String[] args) {
		
		//arrays are fixed in size
		String [] students=new String[3];
		students[0]="hassna";
		students[1]="faisal";
		students[2]="kemal";

	//		students[3]="aoran"; --> during run time java machine will give 
	//	 							java.lang.ArrayIndexOutOfBoundsException:
	//		System.out.println(students[3]);
		
		String [] inClassStudents=new String[5];
		
		inClassStudents[0]="Hichem";
		inClassStudents[1]="Tetteh";
	
		System.out.println(inClassStudents[2]); // -->null
		
	
	}

}
