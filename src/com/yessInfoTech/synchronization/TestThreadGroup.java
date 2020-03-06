package com.yessInfoTech.synchronization;

public class TestThreadGroup implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		TestThreadGroup tg = new TestThreadGroup();
		ThreadGroup g = new ThreadGroup("thread group");
		Thread t1 = new Thread(g, tg, "one");
		t1.start();

		Thread t2 = new Thread(g, tg, "two");
		t2.start();

		Thread t3 = new Thread(g, tg, "thress");
		t3.start();

		g.list();
		
		g.interrupt();

	}

}
