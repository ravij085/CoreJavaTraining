package com.yessInfoTech.ExceptionHandling;

 public class TryCatchDemo {
	
	
	
	 public TryCatchDemo() {
		// TODO Auto-generated constructor stub
	}
	
	
	 int a ;
	protected void display()
	{
		System.out.println("hrllo");
	}

	public static void main(String args[]) {
		try {
			int data = 50 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("rest of the code...");
		
		
		int d = 2/0;
		
		
		
//		int[] a;
		int[] a = new int[5];
		
		a[4] = 3;
		a[5] = 4;
		
		System.out.println(a[4]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}