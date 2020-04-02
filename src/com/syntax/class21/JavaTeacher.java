package com.syntax.class21;

public class JavaTeacher extends Teacher{

//		Compiler will try to create default constructor
// 		and make a call inside to parent class default constructor
//	JavaTeacher(){		
//	}
	
	String certifications;
	
	JavaTeacher(String name, String lastName, String certifications){
		super(name, lastName);
		this.certifications = certifications;
	}
	
	 JavaTeacher(String name, String lastName) {
		super(name,lastName);
	}
}
