package com.yessInfoTech.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStream {

	public static void main(String[] args) {

		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\ravi\\Desktop\\ioExamples\\sample.txt");
//			fout.write(65);
			
			
			//writing a string value
			
			String s="Welcome to YessInfotech classess.....";    
            byte b[]=s.getBytes();//converting string into byte array    
            fout.write(b);    
			
			fout.close();
			System.out.println("success...");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
