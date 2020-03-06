package com.yessInfoTech.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestPrintStream {

	public static void main(String[] args) {
		try {
			FileOutputStream fOut = new FileOutputStream("D:\\testout.txt");
			PrintStream pStream = new PrintStream(fOut);

			pStream.print("welcome to yess infotech.......");
			pStream.print("welcome to yess infotech.......");
			fOut.close();
			pStream.close();
			System.out.println("successfully written data to output stream");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
