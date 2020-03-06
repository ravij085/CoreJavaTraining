package com.yessInfoTech.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestInputStreamReader {

	public static void main(String[] args) {
		InputStreamReader inputReader = new InputStreamReader(System.in);
		BufferedReader bufferReader = new BufferedReader(inputReader);

		System.out.println("Please enter your name :");
		try {
			String name = bufferReader.readLine();

			System.out.println("welcome to Yess infotech " + name);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
