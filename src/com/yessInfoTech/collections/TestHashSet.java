package com.yessInfoTech.collections;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {

		HashSet<String> hSetObj1 = new HashSet<>();
		hSetObj1.add("Microsoft");
		hSetObj1.add("Oracle");
		hSetObj1.add("Google");
		hSetObj1.add("Amazon");
		hSetObj1.add("Facebook");
		hSetObj1.add("Facebook");   // we can't insert duplicates also in arraylist

		// traversing through arraylist using iterator

		System.out.println("-----------traversing through arraylist using iterator-----------");
		Iterator<String> itr = hSetObj1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		
		System.out.println("-----------traversing through arraylist using forEach loop-----------");
		for (String compName : hSetObj1) {

			System.out.println(compName);
		}
		
		
		
		System.out.println("-----------traversing through arraylist using forEach loop after removing element from index 1-----------");
		hSetObj1.remove(1);
		for (String compName : hSetObj1) {

			System.out.println(compName);
		}
		
		
		
		
		System.out.println("-----------traversing through arraylist using forEach loop after removing all the elements-----------");
		hSetObj1.removeAll(hSetObj1);
		for (String compName : hSetObj1) {

			System.out.println(compName);
		}
		
		
		
		

	}

}
