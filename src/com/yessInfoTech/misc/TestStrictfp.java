package com.yessInfoTech.misc;

public strictfp  class TestStrictfp {

	
	strictfp double add()
	{
		double c = 10.3+20.20;
		return c;
	}
	
	public static void main(String[] args) {
		
		System.out.println(new TestStrictfp().add());
	}

}
