package com.yessInfoTech.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerialization implements Serializable {

	int id;
	String name;
	transient String city;
	Address adsress;

	public TestSerialization(int id, String name, String city, Address address) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.adsress = address;

	}

	public static void main(String[] args) {
		Address add = new Address("mumbai", 400);
		TestSerialization obj1 = new TestSerialization(121, "Joey", "Pune", add);

		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\ravi\\Desktop\\ioExamples\\sample2.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(obj1);
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("success");

	}

}
