package com.syntax.class04;

public class NestingElseIfs {

	public static void main(String[] args) {
		/* if studen compleded a quiz wwe will check for a score
		 * if score >90 ==> great job
		 * if score >80 ==> well done
		 * if score >70 ==> you could have done better
		 * 
		 * if student did not completed the quiz ==>   not good
		 * please do homework ontime
		 */

		
		boolean quizCompleted=true;
		int score = 46;
		
		if(quizCompleted) {
			System.out.println("let's check your score.");
			
			if(score>90) {
				System.out.println("great job, you study a lot");
			}
			else if (score>80) {
				System.out.println("well done");
			}
			else if (score>70) {
				System.out.println("you could have done better.");
			}
			else {
				System.out.println("you failed.");
			}
		}
		else {
			System.out.println("please do hw ontime.");
		}
		
		
		
		
	}

}
