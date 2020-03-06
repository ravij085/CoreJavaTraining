package com.yessInfoTech.synchronization;

public class Thread1 extends Thread {
	Resource r;

	public Thread1(Resource re) {
		r = re;
	}
	
	public Thread1() {
		// TODO Auto-generated constructor stub
	}

	Resource r1 = new Resource();

	public void run() {
		r.print(2);
	}

}
