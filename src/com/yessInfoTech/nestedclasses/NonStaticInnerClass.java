package com.yessInfoTech.nestedclasses;

public class NonStaticInnerClass {

	private String name = "David";

	class InnerClass {
		void msg() {
			System.out.println("value of name variable is : " + name);
		}
	}

	public static void main(String args[]) {
		NonStaticInnerClass obj1 = new NonStaticInnerClass();
		NonStaticInnerClass.InnerClass inner = obj1.new InnerClass();
		inner.msg();
	}

}
