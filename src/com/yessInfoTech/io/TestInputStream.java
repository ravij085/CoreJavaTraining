package com.yessInfoTech.io;

import java.io.FileInputStream;

public class TestInputStream {

	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\ravi\\Desktop\\ioExamples\\sample.txt");
			
			//reading one charactor from the file
			int i = fin.read();
			System.out.print( "single charactor : "+(char) i);
			
			System.out.println("");
			//reading all the charactors from the file
			
			int j=0;    
			
			System.out.println("reading all the charactors :");
            while((j=fin.read())!=-1){    
             System.out.print((char)j);    
            }  

			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
