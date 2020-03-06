package com.yessInfoTech.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread2 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ":" + "starts executing task");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + ":" + "ends executing task");
	}

}

public class TestThreadPool2 {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 4; i++) {

			Runnable runnable = new WorkerThread2();
			executor.execute(runnable);
		}
		
		executor.shutdown();
		
		while(!executor.isTerminated()) {}
		System.out.println("Finished all thread running");
		
	}

}
