package com.yessInfoTech.synchronization;

public class DeadLock2 {

	public static void main(String[] args) {
		
		final String r1 = "Yess";
		final String r2 = "Infotech";
		
		Thread t1 = new Thread() {
			
			public void run() {
				
				synchronized (r1) {
					
					System.out.println("T1 locked r1");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized (r2) {
								System.out.println("T1 locked r2");
					}
					
				}
				
			}
			
			
		};
		
		
		
Thread t2 = new Thread() {
			
			public void run() {
				
				synchronized (r2) {
					
					System.out.println("T2 locked r2");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized (r1) {
								System.out.println("T2 locked r1");
					}
					
				}
				
			}
			
			
		};

		
		t1.start();
		t2.start();
		
		
	}

}
