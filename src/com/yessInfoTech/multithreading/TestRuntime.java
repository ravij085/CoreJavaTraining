package com.yessInfoTech.multithreading;

public class TestRuntime  extends Thread{
	
	public void run() {
		System.out.println("task completed");
	}

	public static void main(String[] args) {

		Runtime run = Runtime.getRuntime();
		TestRuntime t1 = new TestRuntime();
		run.addShutdownHook(t1);

		System.out.println(run.freeMemory());

		for (int i = 0; i <= 50000; i++) {
			new TestRuntime();
		}

		System.out.println("free memory after creating objects :" + run.freeMemory());
		
		
		System.out.println(run.availableProcessors());
		System.exit(-2);
		System.out.println("after JVM termonates");

	}

}
