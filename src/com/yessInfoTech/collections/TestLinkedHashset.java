package com.yessInfoTech.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashset {

	public static void main(String[] args) {

		LinkedHashSet<String> lHSetObj1 = new LinkedHashSet<>();
		lHSetObj1.add("Microsoft");
		lHSetObj1.add("Oracle");
		lHSetObj1.add("Google");
		lHSetObj1.add("Amazon");
		lHSetObj1.add("Facebook");
		lHSetObj1.add("Facebook"); // we can't insert duplicates also in arraylist

		// traversing through arraylist using iterator

		System.out.println("-----------traversing through arraylist using iterator-----------");
		Iterator<String> itr = lHSetObj1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-----------traversing through arraylist using forEach loop-----------");
		for (String compName : lHSetObj1) {

			System.out.println(compName);
		}

		System.out.println(
				"-----------traversing through arraylist using forEach loop after removing element from index 1-----------");
		lHSetObj1.remove(1);
		for (String compName : lHSetObj1) {

			System.out.println(compName);
		}

		System.out.println(
				"-----------traversing through arraylist using forEach loop after removing all the elements-----------");
		lHSetObj1.removeAll(lHSetObj1);
		for (String compName : lHSetObj1) {

			System.out.println(compName);
		}

	}

}
