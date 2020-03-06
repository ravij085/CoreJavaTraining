package com.yessInfoTech.synchronization;

public class Resource {

	synchronized void print(int n) {

		System.out.println(Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++) {

			System.out.println(n * i);

		}
	}

}
