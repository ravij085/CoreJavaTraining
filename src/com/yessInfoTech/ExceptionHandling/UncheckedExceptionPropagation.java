package com.yessInfoTech.ExceptionHandling;

public class UncheckedExceptionPropagation {

	
	void method1()
	{
		int a = 5/0;
		
	}
	
	void method2()
	{
		method1();
		
		System.out.println("other logic from method 2");
	}
	
	void method3()
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
			
			
			System.out.println("other logic");
		}

	}

}
