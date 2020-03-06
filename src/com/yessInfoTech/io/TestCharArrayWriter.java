package com.yessInfoTech.io;

import java.io.CharArrayWriter;
import java.io.FileWriter;

public class TestCharArrayWriter {

	public static void main(String[] args) throws Exception {
		CharArrayWriter out = new CharArrayWriter();
		out.write("Welcome to Yess Infotech");
		FileWriter f1 = new FileWriter("C:\\Users\\ravi\\Desktop\\ioExamples\\a.txt");
		FileWriter f2 = new FileWriter("C:\\Users\\ravi\\Desktop\\ioExamples\\b.txt");
		FileWriter f3 = new FileWriter("C:\\Users\\ravi\\Desktop\\ioExamples\\c.txt");
		FileWriter f4 = new FileWriter("C:\\Users\\ravi\\Desktop\\ioExamples\\d.txt");
		out.writeTo(f1);
		out.writeTo(f2);
		out.writeTo(f3);
		out.writeTo(f4);
		f1.close();
		f2.close();
		f3.close();
		f4.close();
		System.out.println("Success...");

	}

}
