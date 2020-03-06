package com.yessInfoTech.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestDeserialization {

	public static void main(String[] args) {

		try {
			ObjectInputStream in = new ObjectInputStream(
					new FileInputStream("C:\\Users\\ravi\\Desktop\\ioExamples\\sample2.txt"));
			TestSerialization s = (TestSerialization) in.readObject();
			System.out.println(s.id + " " + s.name + " " + s.city + " ");
			System.out.println(s.adsress.cityName);

			in.close();
		} catch (Exception e) {

		}
	}

}
