package com.yessInfoTech.abstractclassAndinterface;

public class EmployeeApp {

	public static void main(String args[])
	{
		
		Employee empObj = new PerEmployee();
		empObj.work();
		System.out.println(empObj.a);
		
		
		EmployeeInterface obj = new ImplementEmployee();
		System.out.println(obj.a);
		
//		obj.a = 6;
		
		
		final int b = 5;
//		b=6;
		
		obj.draw();
	}

}
