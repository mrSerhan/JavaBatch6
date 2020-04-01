package com.syntax.class20;

public class TestClass {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.empNumber=101;
		emp.salary=90000;
		emp.getPaid();
		Employee.company="Albatros Co";
		Employee.work();
		System.out.println("---------------------");
		
		ProductOwner po = new ProductOwner();
		//features accessible from grand parent
		po.empNumber=123;
		po.salary = 150000;
//		po.ssn --> CE: private members of the class not available
		ProductOwner.company = "Albatros Co";
//		features accessible from immediate parent
		po.ceremonies = "Sprint Grooming, sprint planing, Sprint Demo, Daily Stand Up";
		po.attendMeetings();
		po.prioritizeBacklog();
		ProductOwner.work();
		Employee.work();
		
		
	}

}
