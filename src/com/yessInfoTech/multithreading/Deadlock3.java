package com.yessInfoTech.multithreading;

public class Deadlock3 {

	public static void main(String[] args) {
		
		
		String r1 ="yess";
		String r2 ="yess  info";
		
		
		
		
		Thread t1 = new Thread() {
			
			public void run() {
				synchronized (r1) {
					System.out.println("t1 holds lock of r1");
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized (r2) {
							System.out.println("t1 holds lock of r2");
					}
					
				}
			}
			
			
		};
		
		
Thread t2 = new Thread() {
			
			public void run() {
				synchronized (r2) {
					System.out.println("t2 holds lock of r2");
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized (r1) {
							System.out.println("t2 holds lock of r1");
					}
					
				}
			}
			
			
		};
		
		t1.start();
		t2.start();
		
		

	}

}
