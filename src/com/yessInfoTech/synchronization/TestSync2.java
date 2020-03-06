package com.yessInfoTech.synchronization;

public class TestSync2 {
	
	public static void main(String[] args) {
		Display d1 =new Display();
		Display d2 =new Display();
		MyThread t1 = new MyThread(d1, "Ranju");
		MyThread t2 = new MyThread(d2, "Ravi");
		
		t1.start();
		t2.start();
	}

}
