package com.yessInfoTech.nestedclasses;

interface OuterInterface {

	interface NestedInterface {
		void display();

	}
}

public class TestNestedInterface implements OuterInterface.NestedInterface {

	@Override
	public void display() {
		System.out.println("from display method......");

	}

	public static void main(String[] args) {
		OuterInterface.NestedInterface obj = new TestNestedInterface();
		obj.display();

	}

}
