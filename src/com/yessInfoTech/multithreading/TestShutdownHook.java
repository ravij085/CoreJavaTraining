package com.yessInfoTech.multithreading;

public class TestShutdownHook extends Thread {

	public void run() {

		System.out.println("shutdown completed");
	}

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		TestShutdownHook t1 = new TestShutdownHook();

		r.addShutdownHook(t1);
		System.out.println("no main sleeping");
		/*
		 * try { Thread.sleep(3000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

	}

}
