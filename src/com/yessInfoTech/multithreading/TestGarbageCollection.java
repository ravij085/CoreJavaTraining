package com.yessInfoTech.multithreading;

public class TestGarbageCollection {

	public void finalize() {
		System.out.println("object is garbage collected......");
	}

	public static void main(String[] args) {

		TestGarbageCollection obj = new TestGarbageCollection();
		obj = null;

		System.gc();

	}

}
