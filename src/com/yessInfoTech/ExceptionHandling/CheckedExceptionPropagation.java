package com.yessInfoTech.ExceptionHandling;

import java.sql.SQLException;

public class CheckedExceptionPropagation {

	
	void method1() throws SQLException
	{
		throw new SQLException();
		
	}
	
	void method2() throws SQLException
	{
		method1();
		
		System.out.println("other logic from method 2");
	}
	
	void method3() throws SQLException
	{
		method2();
	}
	
	public static void main(String[] args) {
		
		try {
		new UncheckedExceptionPropagation().method3();
		}
		
		catch(ArithmeticException a)
		{
			System.out.println("exception caught");
//			a.printStackTrace();
			
			
			
		}
		
		System.out.println("other logic");

	}

}
