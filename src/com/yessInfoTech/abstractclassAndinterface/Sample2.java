package com.yessInfoTech.abstractclassAndinterface;

public class Sample2 {

	String a;
	int b;

	public Sample2() {
		this(2);
		System.out.println("default constructor");

	}

	public Sample2(int b) {

		this.b = b;
		System.out.println("constructor with one parameter");

	}

	public Sample2(String a, int b) {
		this();
		this.a = a;
		this.b = b;
		System.out.println("constructor with two parameteres");

	}

	public static void main(String[] args) {
		Sample2 obj = new Sample2();

	}

}
