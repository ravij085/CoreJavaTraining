package com.yessInfoTech.ExceptionHandling;

public class AgeNotValidExCheck {

	
	void displayAge(String age) throws AgeNotValidException
	{
		
		if(!age.equals("20"))
			 throw new AgeNotValidException("not valid age");
		else
			System.out.println("correct age");
		
	}
	
	public static void main(String[] args) {
		

	}

}
