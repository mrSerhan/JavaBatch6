package com.syntax.class16;

public class LocalVeriables {

	void nameInside() {
		String name = "John"; // local variable that visible only within method it was declared
	}
	
	public static void main (String[] args) {
		// System.out.println(name); CE: name wont be visiable to another method
		// since its scope only within nameInside method.
		
		
	}
}
