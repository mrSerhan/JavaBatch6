package com.syntax.class14;

public class methodExamples {
	
	// want to create a method that will be greeting a person
	
	void greet() {
		System.out.println("Hello Serhan");
	}

	void greet1(String name,String middleName, int age) {
		System.out.println("Hello "+name+" your middle name is "+middleName+" and you are "+age);
	}
	public static void main (String [] args) {
		// how can I call method greet? --> first we need to create an Object of the class
		//where that method belongs
		
		//className variableName = new ClassName();
		methodExamples object1 = new methodExamples();
		object1.greet();
		
		object1.greet1("Ebru","Zor",36);
		object1.greet1("Furkan","Kaan",10);
		object1.greet1("Burhan","Efe",6);
	}
	
}
