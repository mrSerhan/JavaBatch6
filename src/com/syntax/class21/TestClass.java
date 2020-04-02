package com.syntax.class21;

public class TestClass {

	public static void main(String[] args) {
		
		MathTeacher mt1 = new MathTeacher("Brian","Qisbert");
		System.out.println(mt1.name);

		MathTeacher mt2 = new MathTeacher("Brian","Qisbert");
		System.out.println(mt2.name);
		
		JavaTeacher jt1 = new JavaTeacher("Anna", "Smith", "Java 8");
		System.out.println(jt1.name);
	}

}
