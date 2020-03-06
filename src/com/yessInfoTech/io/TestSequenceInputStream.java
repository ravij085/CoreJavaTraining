package com.yessInfoTech.io;

import java.io.FileInputStream;

public class TestSequenceInputStream {

	public static void main(String[] args) {
		try {
			FileInputStream file1 = new FileInputStream("C:\\Users\\ravi\\Desktop\\ioExamples\\file1.txt");
			FileInputStream file2 = new FileInputStream("C:\\Users\\ravi\\Desktop\\ioExamples\\file2.txt");
			java.io.SequenceInputStream inst = new java.io.SequenceInputStream(file1, file2);

			int j;
			while ((j = inst.read()) != -1) {
				System.out.print((char) j);
			}
			inst.close();
			file1.close();
			file2.close();

		} catch (Exception e) {

		}
	}

}
