package com.yessInfoTech.synchronization;

public class Thread2 extends Thread {

	Resource r;

	public Thread2(Resource re) {
		r = re;
	}
	
	public Thread2() {
		// TODO Auto-generated constructor stub
	}

	Resource r1 = new Resource();

	public void run() {
		r.print(100);
	}

}
