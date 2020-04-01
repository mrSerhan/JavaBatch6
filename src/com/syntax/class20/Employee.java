package com.syntax.class20;

public class Employee {

	static String company;
	int empNumber;
	double salary;
	private long ssn;
	
	void getPaid() {
		System.out.println("Employee get "+salary);
	}
	
	static void work() {
		System.out.println("employee work at "+company);
	
	}
	
}
