package com.yessInfoTech.misc;

public class TestInstanceIniti {

	String name;
	{
		System.out.println("hiiiiii");
		 name = "Yess";}
	
	
	
	TestInstanceIniti(){
		
		System.out.println("constructor.....");
		
		
		System.out.println("this is second message from the program");
	}
	
	public static void main(String[] args) {
		
		TestInstanceIniti obj1 = new TestInstanceIniti();
		TestInstanceIniti obj2 = new TestInstanceIniti();
		System.out.println(obj1.name);
		System.out.println(obj2.name);

	}

}
