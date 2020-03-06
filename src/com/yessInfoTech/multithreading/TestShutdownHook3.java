package com.yessInfoTech.multithreading;

public class TestShutdownHook3 extends Thread{
	
	public void run() {
		System.out.println("task completed");
	}

	public static void main(String[] args) {
		
		Runtime run = Runtime.getRuntime();
		TestShutdownHook3 t1 = new TestShutdownHook3();
		
		run.addShutdownHook(t1);

	}

}
