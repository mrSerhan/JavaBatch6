package com.syntax.class17;

public class Task3 {

//Create a method that will accept a String as a parameter and return a new String that
//consist only of vowels. Method should be available inside the class where it was declared 
//and executed by calling it is name.


	
		
		private static String onlyVowels (String a) {
						String vowels = "";
			for(int i = 0; i < a.length(); i++) {
				if(a.charAt(i)=='a'|| a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u' )  {
					vowels = vowels+a.charAt(i);
				}
			}			
			return vowels;
		}
		
		public static void main(String[] args) {
			
			System.out.println(onlyVowels("serhan"));
			
		}
		
	}
	
