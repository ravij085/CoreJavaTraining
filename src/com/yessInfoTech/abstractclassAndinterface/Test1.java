package com.yessInfoTech.abstractclassAndinterface;

class Test1 {
	static int x = 10;

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();

		t1.x = 20;
		System.out.print(t1.x + " ");
		System.out.println(t2.x);
	}
}
