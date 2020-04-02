package com.syntax.class21;

public class ProgrammingLanguage {

	String name;
	String variables;
	
		public ProgrammingLanguage(String name, String variable) {
			this.name = name;
			this.variables = variable;
		}
}


class Java extends ProgrammingLanguage{
	
	String constructor;
	
	Java(String name, String variables, String constructor){
		super(name,variables);
		this.constructor = constructor;
	}
	
	public void details() {
		System.out.println(name+" can have variables "+variables+" and constructor "+constructor);
	}
}
//	
//class JavaScript extends ProgrammingLanguage{
//	
//	public void details() {
//		System.out.println(name+" can have variables "+variable);
//	}
//}