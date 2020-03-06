package com.yessInfoTech.nestedclasses;

public class TestMemberInnerClass {

	String name = "Yess InfoTech";
	private String address = "Megacenter Pune";

	class MemberInner {

		String course = "java";

		void display() {
			System.out.println("This is from Member Inner class method !!!");

			System.out.println("Address from outer class : " + address);
		}

	}

	public static void main(String[] args) {

		TestMemberInnerClass outerObj = new TestMemberInnerClass();
		TestMemberInnerClass.MemberInner innerObj = outerObj.new MemberInner();
		innerObj.display();

	}

}
