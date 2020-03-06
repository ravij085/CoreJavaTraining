package com.yessInfoTech.ExceptionHandling;

import java.io.IOException;

public class CustomException {

	
	void checkEmpId(String id) throws IOException  
	{
		if(!id.equals("123"))
		{
			throw new IOException("wrong id , put correct one");
		}
		
		else {
			System.out.println("welcome to page");
		}
		
	}
	
	public static void main(String[] args) {
		
		try {
		new CustomException().checkEmpId("1");
		}
		catch(Exception e)
		{
			
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}

}
