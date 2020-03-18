package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		
		int temp=35;
		int freezeTemp=32;
		
		if(temp<freezeTemp) {
			System.out.println("Water will freeze with temperature "+temp);
		}
		
		else {
			System.out.println("Water will not freeze with temperature "+temp);
		}
	}

}
