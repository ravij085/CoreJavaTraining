package com.yessInfoTech.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("D:\\testout.txt");

			writer.write("welcomme to pune");
			writer.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
