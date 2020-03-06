package com.yessInfoTech.misc;

public class TestObjectCloning implements Cloneable {

	String name = "yess";

	public static void main(String[] args) throws CloneNotSupportedException {

		TestObjectCloning obj1 = new TestObjectCloning();

		TestObjectCloning obj2 = (TestObjectCloning) obj1.clone();

		System.out.println(obj2.name);

	}

}
