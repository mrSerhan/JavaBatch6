package com.syntax.class11;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
/* Accept username, password and confirm password from a user and check following requirements:

Username and Password cannot be  empty, if so→ message=“Username and Password cannot be empty”.
Password should be minimum 8 characters, if less → message=“Password is too short”.
Password cannot contain username if so, → message=“Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”		 */
		
		Scanner scan = new Scanner(System.in);
		String userName = null;
		String password = null;
		String confirmPass = null;
		System.out.println("Please create a username :");
		userName = scan.nextLine();
		System.out.println("Please create a password");
		password = scan.nextLine();

		//		System.out.println("Please confirm your password");
		//		confirmPass = scan.nextLine();
		
		if((userName.isEmpty() )|| (password.isEmpty())) {
			if(password.length() >= 8 ) {
				if(!password.contains(userName)) {
					System.out.println("please confirm your password");
					confirmPass = scan.nextLine();
					if(password.equals(confirmPass)) {
						System.out.println("your account is created");
					}else {
						System.out.println("password does not match");
					}
				}else {
					System.out.println("password can not contain username");
				}
			}else {
				System.out.println("password is too short");
			}						
		}else{
			System.out.println("username and password can not be empty.");
		}
		
	
		
	}

}
