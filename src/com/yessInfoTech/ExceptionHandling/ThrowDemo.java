package com.yessInfoTech.ExceptionHandling;

public class ThrowDemo {

	void display() {

		throw new NullPointerException();
	}

	void catchException()  {

		display();

	}

	public static void main(String[] args) {

		ThrowDemo tDemo = new ThrowDemo();
		try {
		tDemo.catchException();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
