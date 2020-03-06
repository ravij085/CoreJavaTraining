package com.yessInfoTech.nestedclasses;

public class StaticInnerClass {

	static String name = "David";

	static class InnerClass {
		void msg() {
			System.out.println(" value of name variable is : " + name);
		}
	}

	public static void main(String[] args) {
		StaticInnerClass.InnerClass obj1 = new StaticInnerClass.InnerClass();
		obj1.msg();

	}

}
