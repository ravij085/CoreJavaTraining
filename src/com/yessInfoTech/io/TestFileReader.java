package com.yessInfoTech.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestFileReader {

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("D:\\testout.txt");

			int i;

			while ((i = reader.read()) != -1) {
				System.out.print((char) i);

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
