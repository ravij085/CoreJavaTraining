package com.yessInfoTech.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
	private String message;

	public void run() {
		System.out.println(Thread.currentThread().getName() + ": " + "Starts executing task....");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ":" + " ends executing task....");
	}

}

public class TestThreadPool {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 2; i++) {
			Runnable worker = new WorkerThread();
			executor.execute(worker);
		}
		executor.shutdown();

		while (!executor.isTerminated()) {
		}
		System.out.println("Finished all threads");

	}
}
