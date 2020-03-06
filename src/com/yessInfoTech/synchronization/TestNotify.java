package com.yessInfoTech.synchronization;

class Wish {

	String cityName;

	 void wish() {
		if ("Mumbai".equalsIgnoreCase(cityName))
			System.out.println("Good morninggggggg...Mumbai");
		else
			try {
				System.out.println("waiting for city name as mumbai");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		System.out.println("good morning :" + cityName);
	}

	 void setCityName(String cityName) {
		System.out.println("setting city as mumbai");
		this.cityName = cityName;
		notifyAll();
	}

}

public class TestNotify {

	public static void main(String[] args) {

		Wish wishObj = new Wish();
		Thread t1 = new Thread() {

			public void run() {
				wishObj.wish();

			}
		};
		Thread t2 = new Thread() {

			public void run() {
				wishObj.setCityName("Mumbai");

			}
		};

		t1.start();
		t2.start();

	}

}
