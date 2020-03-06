package com.yessInfoTech.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestHashMap {

	public static void main(String args[]) {
		HashMap<Integer, String> hashMapObj1 = new HashMap<>();

		hashMapObj1.put(1, "Google");
		hashMapObj1.put(2, "Apple");
		hashMapObj1.put(3, "Amazon");
		hashMapObj1.put(4, "Facebook");
		hashMapObj1.put(4, "Facebook"); // we can't insert duplicate key here
		hashMapObj1.put(5, "Facebook"); // we can insert duplicate value

		System.out.println("------Key value pair as below :------ ");
		for (Map.Entry<Integer, String> entry : hashMapObj1.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);

		}
		
		
		
		//Removing records from Hashmap
		
		hashMapObj1.remove(4);
		hashMapObj1.remove(5);


		System.out.println("---- after removing record with duplicate values  ----");
		
		for (Map.Entry<Integer, String> entry : hashMapObj1.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);

		}

	}

}
