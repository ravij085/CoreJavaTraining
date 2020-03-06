package com.yessInfoTech.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class TestByteArrayOutputStream {

	public static void main(String[] args) {

		try {
			FileOutputStream fout1 = new FileOutputStream("C:\\Users\\ravi\\Desktop\\ioExamples\\file3.txt");
			FileOutputStream fout2 = new FileOutputStream("C:\\Users\\ravi\\Desktop\\ioExamples\\file4.txt");

			ByteArrayOutputStream bout = new ByteArrayOutputStream();

			String b = "welcome to yess infotech.......!!!";

			byte[] bArr = b.getBytes();

			bout.write(bArr);

			bout.writeTo(fout1);
			bout.writeTo(fout2);

			bout.flush();
			bout.close();// has no effect
			System.out.println("Success...");
		}

		catch (Exception e) {

		}

	}

}
