package com.yessInfoTech.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class TestBufferedInputStream {

	public static void main(String[] args) {
		
		byte a = 123;
//		byte a = 'ff';
		char f = 'f';
		System.out.println("fssss"+f);
		
		
		try {
			FileInputStream fin = new FileInputStream("D:\\testout.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i;
			while ((i = bin.read()) != -1) {
				System.out.print((char) i);
			}
			bin.close();
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
