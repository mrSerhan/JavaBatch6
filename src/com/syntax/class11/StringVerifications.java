package com.syntax.class11;

public class StringVerifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String message = "Welcome Admin!";
		// verify that message contains username which Admin
		System.out.println("--- contains FUNCTION ---");
		System.out.println(message.contains("Admin"));
		
		boolean flag = message.contains("welcome");
		System.out.println(flag);
		
			System.out.println();
		System.out.println("--- startsWith() FUNCTION ---");
		// we want to see if welcome starts with Welcome
		boolean starts = message.startsWith("Welcome");
		System.out.println(starts);
			
		System.out.println();
		System.out.println("--- endsWith() FUNCTION ---");
		// we want to verify that welcome message ends with username and !		
		String username = "Admin";
		boolean ends = message.endsWith(username);
		System.out.println(ends);
	}

}
