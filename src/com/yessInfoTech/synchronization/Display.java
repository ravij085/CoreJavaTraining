package com.yessInfoTech.synchronization;

public class Display {

	public   void wish(String name) {
		
		
		synchronized (Display.class) {
			
		
		for (int i = 0; i <= 5; i++) {
			System.out.print("Good morning : ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(name);
			
		}
		}
	}

}
