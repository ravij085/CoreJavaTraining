package com.yessInfoTech.abstractclassAndinterface;

interface Printable {
	void print();
}

interface Showable {
	void print();
}

class TestInterface3 implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		Showable obj = new TestInterface3();
		obj.print();
	}
}