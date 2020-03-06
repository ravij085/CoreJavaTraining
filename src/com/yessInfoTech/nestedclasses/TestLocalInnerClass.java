package com.yessInfoTech.nestedclasses;

public class TestLocalInnerClass {

	void display() {

		class LocalInner {
			void localInnerMethod() {
				System.out.println("from local inner class method");
			}

		}

		LocalInner localInnerObj = new LocalInner();
		localInnerObj.localInnerMethod();
	}

	public static void main(String[] args) {

		TestLocalInnerClass testLocalInnerClass = new TestLocalInnerClass();
		testLocalInnerClass.display();

	}

}
