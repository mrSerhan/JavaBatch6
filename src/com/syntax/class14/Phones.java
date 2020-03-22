package com.syntax.class14;

public class Phones {
	 
	 String brand;	
	 String color;
	 String memory;
	 String screenSize;
	
	 void internet() {
		 System.out.println(brand +" has internet connection");
	 }
	 
	 void screen() {
		 System.out.println(brand + " has touchable screen");
	 }

	  
	 
	 
	public static void main(String[] args) {
		//create an object from Phone class
		//instanciate Phone class
		
		//new Phone(); --> create an Object of Phone
		//iphone --> variable/reference variable
		// Phone --> type of variable
		
		 Phones phone1 = new Phones();
			phone1.brand = "iphone";
			phone1.color = "Black";
			phone1.memory = "64GB";
			phone1.screenSize = "7 inches";
			phone1.internet();
			phone1.screen();
			
			Phones phone2 = new Phones();
			phone2.brand = "samsung";
			phone2.color = "white";
			phone2.memory = "32GB";
			phone2.screenSize = "6 inches";
			phone2.screen();
			phone2.internet();
				
			Phones phone3 = new Phones();
			phone3.brand = "nokia";
			phone3.color = "grey";
			phone3.memory = "8GB";
			phone3.screenSize = "5 inches";

	
	}

}
