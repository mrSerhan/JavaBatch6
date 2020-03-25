package com.syntax.class15;

public class Tasks {

	void largerOr (int a, int b) {
		
		if(a>b) {
			System.out.println(a+ " is larger number");
		}else {
			System.out.println(b+" is larger number");
		}
	}
	
	void evenOrOdd (int a) {
			
		if(a%2==0) {
				System.out.println(a+" is even number");
		}else {
				System.out.println(a+" is odd number");
			}
	}
	
	void isPolindrome (String str) {
		boolean isPalindrome = true;
				String reverse = "";
		for(int i = str.length()-1; i>=0;i--) {
			reverse = reverse + str.charAt(i);			
		}
		if(reverse.equals(str)) {
			System.out.println(str + " is palindrome word");
		}else {
			System.out.println(str + " is not polindrome word");
		}
	}
	
	void diffLanguage(String lang) {
		if(lang.equalsIgnoreCase("English")) {
			System.out.println("Hello");
		}else if(lang.equalsIgnoreCase("Chinese")) {
			System.out.println("Nihaw");
		}else if(lang.equalsIgnoreCase("Turkish")) {
			System.out.println("Merhaba");
		
	}
}
}