package com.syntax.class19;

public class USA {

	String state, stateCapital;
	
	public USA(String state, String stateCapital) {
		this.state = state;
		this.stateCapital = stateCapital;
	}
	
	public void displayState() {
		System.out.println(state);
	}
	
	public void displayStateCapital() {
		System.out.println(stateCapital);
	}
	
	// can I call a method inside another method? --> YES
	public void displayInfo() {
		displayState();
		displayStateCapital();		
	}
	
	public static void main(String[] args) {
		
		USA state1 = new USA("Texas", "Austin");
		state1.displayState();
		state1.displayStateCapital();
		state1.displayInfo();
	}

}
