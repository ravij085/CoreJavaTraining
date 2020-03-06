package com.yessInfoTech.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> lListObj1 = new LinkedList<>();
		lListObj1.add(1);
		lListObj1.add(2);
		lListObj1.add(3);
		lListObj1.add(4);
		lListObj1.add(5);
		lListObj1.add(5); // we can insert duplicates also in arraylist

		lListObj1.add(4);

		// traversing through arraylist using iterator

		System.out.println("-----------traversing through arraylist using iterator-----------");
		Iterator<Integer> itr = lListObj1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-----------traversing through arraylist using forEach loop-----------");
		for (Integer compName : lListObj1) {

			System.out.println(compName);
		}

		System.out.println(
				"-----------traversing through arraylist using forEach loop after removing element from index 1-----------");
		lListObj1.remove(1);
		for (Integer compName : lListObj1) {

			System.out.println(compName);
		}

		System.out.println(
				"-----------traversing through arraylist using forEach loop after removing all the elements-----------");
		lListObj1.removeAll(lListObj1);
		for (Integer compName : lListObj1) {

			System.out.println(compName);
		}

	}

}
