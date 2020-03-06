package com.yessInfoTech.abstractclassAndinterface;

public class TestConstructor {

	int a;
	double b;
	
	public TestConstructor() {
		// TODO Auto-generated constructor stub
	}

	public TestConstructor(int a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {

		TestConstructor obj = new TestConstructor();

		System.out.println("a : " + obj.a + "b: " + obj.b);

	}

}
