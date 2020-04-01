package com.syntax.class20;

public class ScrumTeam extends Employee {

	
	String ceremonies;
	
	void attendMeetings() {
		System.out.println("Scrum team attend "+ceremonies);
	}
	
}

class ProductOwner extends ScrumTeam{
	
	void prioritizeBacklog() {
		System.out.println("PO prioritize product backlog");
	}		
}

class ScrumMaster extends ScrumTeam{
	
	void navigateTeam() {
		System.out.println("Scrum Master faciliates Scrum Team");
	}
}

class Developer extends ScrumTeam{
	
	void coding() {
		System.out.println("Developer write codes");
	}
}

class Tester extends ScrumTeam{
	
	void test() {
		System.out.println("Testers ensures quality of codeing");		
	}
}

class BusinessAnalyst{
	
	void workWithRequirements() {
		System.out.println("BA requirement from customer");
	}
}