package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
		/* if hour 1-11   morning
		 * if hour 12-15  afternoon
		 * if hour 16-20   evening
		 * if hour 21-24   night
		 */
		
		
		int hour=50;
		String timeOfDay;
		
		if(hour>=1 && hour<11) {
			timeOfDay="Morning";
		}else if(hour>=12 && hour <=15) {
			timeOfDay="Afternoon";
		}else if(hour>=16 && hour<=20) {
			timeOfDay="Evening";
		}else if(hour>=21 && hour <=24) {
			timeOfDay="Night";
		}else {
			timeOfDay="Unknown";
		}
		//if time of the day is not unknown ==> only then I want to see the message
		if(!timeOfDay.contentEquals("Unknown")) {
		System.out.println("Right now is "+timeOfDay);
	}
	}
}
