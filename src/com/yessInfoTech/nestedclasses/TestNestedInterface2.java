package com.yessInfoTech.nestedclasses;

class Sample {

	interface NestedInterface {

		void display();
	}

}

public class TestNestedInterface2 implements Sample.NestedInterface {
	@Override
	public void display() {
		System.out.println("from display method    !!!!!!");

	}

	public static void main(String[] args) {

		Sample.NestedInterface obj = new TestNestedInterface2();
		obj.display();

	}

}
