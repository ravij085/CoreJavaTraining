package com.yessInfoTech.multithreading;

import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread3 implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ":" + "starts task");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + ":" + "starts task");

	}

}

public class TestThreadPool3 {

	public static void main(String[] args) {
		
		

		ExecutorService executor = Executors.newFixedThreadPool(5);

		for (int i = 0; i < 2; i++) {
			Runnable worker = new WorkerThread3();
			executor.execute(worker);
		}

		executor.shutdown();

		while (!executor.isTerminated()) {
		}
		System.out.println("all task completed");

	}

}
