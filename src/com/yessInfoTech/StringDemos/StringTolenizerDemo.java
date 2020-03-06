package com.yessInfoTech.StringDemos;

import java.util.StringTokenizer;

public class StringTolenizerDemo {

	public static void main(String[] args) {
		
		StringTokenizer stk = new StringTokenizer("yess ,infotech  hadapsar" , ",");
		
		
		System.out.println(stk.nextToken());
		
		while(stk.hasMoreTokens())
		{
			System.out.println(stk.nextToken());
		}
		
		

	}

}
