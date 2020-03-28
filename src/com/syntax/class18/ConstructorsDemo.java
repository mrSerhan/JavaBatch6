package com.syntax.class18;

public class ConstructorsDemo {

	static String str="Hello";
	
	 ConstructorsDemo() {
		System.out.println("I am your constructor");
		System.out.println("I am non argument constructor");
	}
	 
	 ConstructorsDemo(String str){
		 System.out.println("I am a constructor with 1 String parameter "+str);
	 }
	 
	 ConstructorsDemo(int num){
		 System.out.println("I am a constructor with 1 integer parameter "+num);
	 }
	 
	 ConstructorsDemo(String str, int num){
		 System.out.println("I am a constructor with 2 parameters: "+str+" & "+num);
	 }
	 
	 void ConstructorsDemo() { // as soon as we add return type --> it becomes method
		 System.out.println("I do not know who am I");
	 }
	 
	 
	 public static void main(String[] args) {
		
		// ConstructorsDemo obj = new ConstructorsDemo();
		 System.out.println(str);
		ConstructorsDemo obj  = new ConstructorsDemo();
		ConstructorsDemo obj1 = new ConstructorsDemo("Today is java class");
		ConstructorsDemo obj2 = new ConstructorsDemo(12);
		ConstructorsDemo obj3 = new ConstructorsDemo("yes", 13);
		ConstructorsDemo obj4 = new ConstructorsDemo();
			obj4.ConstructorsDemo();
	}
	 
}
