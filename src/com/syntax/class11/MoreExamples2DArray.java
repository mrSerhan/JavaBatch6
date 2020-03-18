package com.syntax.class11;

public class MoreExamples2DArray {

	public static void main(String[] args) {
		//  lets create 2d array in which we store professions
		
		String [][] professions = {
				{"QA Tester","Developers","Product Owner","Scrum Master"},
				{"Math Teacher","Science Teacher", "Esl Teacher"},
				{"Dentist","Surgeon"}			
			};

		// get elements usinf advanced for loop
		
		for(String [] occupation : professions) {
			for(String title : occupation) {
				System.out.println(title+" ");
			}
		}
	}

}
