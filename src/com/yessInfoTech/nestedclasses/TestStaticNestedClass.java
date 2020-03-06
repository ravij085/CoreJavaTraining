package com.yessInfoTech.nestedclasses;

public class TestStaticNestedClass {

	String name = "Yess infotech";
	static String address = "Mega center";

	static class StaticNestedClass {

		void display() {
			System.out.println("from static nested class method  !!!");
			System.out.println("static variable from outer class : " + address);
		}

		static void display2() {
			System.out.println("from static method of static nested class");
		}

	}

	public static void main(String[] args) {

		TestStaticNestedClass.StaticNestedClass obj = new TestStaticNestedClass.StaticNestedClass();
		obj.display();
		TestStaticNestedClass.StaticNestedClass.display2();

	}

}
