package com.yessInfoTech.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestLinkedHashMap {

	public static void main(String args[]) {
		HashMap<Integer, String> lHashMapObj1 = new HashMap<>();

		lHashMapObj1.put(1, "Google");
		lHashMapObj1.put(2, "Apple");
		lHashMapObj1.put(3, "Amazon");
		lHashMapObj1.put(4, "Facebook");
		lHashMapObj1.put(4, "Facebook"); // we can't insert duplicate key here
		lHashMapObj1.put(5, "Facebook"); // we can insert duplicate value

		System.out.println("------Key value pair as below :------ ");
		for (Map.Entry<Integer, String> entry : lHashMapObj1.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);

		}
		
		
		
		//Removing records from Hashmap
		
		lHashMapObj1.remove(4);
		lHashMapObj1.remove(5);


		System.out.println("---- after removing record with duplicate values  ----");
		
		for (Map.Entry<Integer, String> entry : lHashMapObj1.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);

		}

	}

}
