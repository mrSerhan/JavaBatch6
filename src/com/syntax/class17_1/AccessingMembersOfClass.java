package com.syntax.class17_1;
import com.syntax.class17.Employee;
public class AccessingMembersOfClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee.title = "QA Engineer";
		Employee emp = new Employee();
		emp.name = "Ahmet";
		// below variable not available due to restrictions
	//	emp.lastName 		-->protected
	//	emp.salary=4000;	-->default
	//	emp.ssn				-->private
		
		Employee.method1();
		emp.method1();  // not prefferable
	//below methods not available due to restrictions
	//	emp.method2();		-->protected
	//	emp.method3();		-->default
	//	emp.method4();		-->private
		
	}

}
