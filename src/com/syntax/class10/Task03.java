package com.syntax.class10;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] countries= {"Turkey","Usa","Greek","Germany"};
		
		for(String country:countries) {
			if(country.equals("Turkey")) {
				System.out.println(country+" capital city is Istanbul" );
			}else if(country.equals("Usa")) {
				System.out.println(country+" capital city is Washington Dc" );
			}else if(country.equals("Greek")) {
				System.out.println(country+" capital city is Atina");
			}else if(country.equals("Germany")) {
				System.out.println(country+" capital city is Berlin");
		}
		
		
	}
		System.out.println("===============other loop==================");
		String capital;
		for(int i=0;i<countries.length;i++) {
			
				if(countries.equals("Turkey")) {
					capital="Ankara";
				}else if(countries.equals("Usa")) {
					capital="Washington Dc";
				}else if(countries.equals("Greek")) {
					capital="Atina";
				}else if(countries.equals("Germany")) {
					capital="Berlin";
			}
			System.out.println(countries[i]);

		
		
	}
}

}
