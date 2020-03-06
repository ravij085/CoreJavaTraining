package com.yessInfoTech.collections;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

import com.yessInfoTech.ExceptionHandling.*;

import com.yessInfoTech.ExceptionHandling.TryCatchDemo;

public class TestArrayList extends TryCatchDemo {

	public static void main(String[] args) {

		TryCatchDemo t = new TryCatchDemo();
		// t.a = 10;

		new TestArrayList().display();

		ArrayList<String> aListObj1 = new ArrayList<>();
		aListObj1.add("Microsoft");
		aListObj1.add("Oracle");
		aListObj1.add("Google");
		aListObj1.add("Amazon");
		aListObj1.add("Facebook");
		aListObj1.add("Facebook"); // we can insert duplicates also in arraylist

		// traversing through arraylist using iterator

		System.out.println("-----------traversing through arraylist using iterator-----------");
		Iterator<String> itr = aListObj1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-----------traversing through arraylist using forEach loop-----------");
		for (String compName : aListObj1) {

			System.out.println(compName);
		}

		System.out.println(
				"-----------traversing through arraylist using forEach loop after removing element from index 1-----------");
		aListObj1.remove(1);
		for (String compName : aListObj1) {

			System.out.println(compName);
		}

		System.out.println(
				"-----------traversing through arraylist using forEach loop after removing all the elements-----------");
		aListObj1.removeAll(aListObj1);
		for (String compName : aListObj1) {

			System.out.println(compName);
		}

		Deque<Integer> deq = new LinkedList<>();

		deq.add(1);
		deq.add(2);
		deq.add(3);

		for (Integer integer : deq) {

			System.out.println(" dddd" + integer.intValue());
		}

	}

}
