package com.syntax.class19;

public class TestClass {

	public static void main(String[] args) {

		Dog dog = new Dog();
		
		dog.breed = "Husky"; //access variable from own class
		
		dog.color = "Grey"; //access variables from parent class
		dog.fur = "Too much";
		dog.size = "Big";

		dog.bark(); // access method from own class
		
		dog.beWild(); //access methods from parent class
		dog.eat();
		dog.sleep();
		
		Animals animal = new Animals();
		
		animal.color = "Any";
		animal.size = "Any";
		animal.fur = "Any";
		
		animal.sleep();
		animal.eat();
		animal.beWild();
		
	}

}
