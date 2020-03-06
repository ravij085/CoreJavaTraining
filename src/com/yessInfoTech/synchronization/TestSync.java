package com.yessInfoTech.synchronization;

public class TestSync {

	public static void main(String[] args) {

		Resource r = new Resource();

		Thread1 t1 = new Thread1(r);
		Thread1 t3 = new Thread1(r);

		t1.setName("t1");
		Thread2 t2 = new Thread2(r);
		t2.setName("t2");
		t3.setName("t3");

//		t2.start();
		t1.start();
		t3.start();

	}

}
