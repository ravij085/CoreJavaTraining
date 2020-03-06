package com.yessInfoTech.multithreading;

public class TestPriorityOfThread extends Thread {

	public void run() {
		System.out.println("running thread name is:" + Thread.currentThread().getName());
		System.out.println("running thread priority is:" + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		TestPriorityOfThread m1 = new TestPriorityOfThread();
		TestPriorityOfThread m2 = new TestPriorityOfThread();
		TestPriorityOfThread m3 = new TestPriorityOfThread();

		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		m3.setPriority(Thread.NORM_PRIORITY);
		m1.start();
		m2.start();
		m3.start();
		

	}

}
