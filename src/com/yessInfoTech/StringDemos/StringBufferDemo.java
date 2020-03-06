package com.yessInfoTech.StringDemos;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer();

		System.out.println(sb1.capacity());

		StringBuffer sb = new StringBuffer("Yess Infotech");

		sb.append(", Hadapsar , Pune ");
		System.out.println(sb);

		System.out.println(sb.capacity());

		String abc = "a";
		String abcd = new String("a");
		System.out.println(abc == abcd);
		
		
		

	}

}
