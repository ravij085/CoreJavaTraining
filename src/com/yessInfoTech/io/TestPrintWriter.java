package com.yessInfoTech.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestPrintWriter {

	public static void main(String[] args) {

		try {
			PrintWriter pWriter = new PrintWriter(new File("D:\\testout.txt"));

			pWriter.write("welcome to yess infotech....!!!!");
			pWriter.flush();
			pWriter.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
