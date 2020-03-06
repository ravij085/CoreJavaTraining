package com.yessInfoTech.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;

public class TestComparator {

	public static void main(String[] args) {
		
		Student obj1 = new Student(4, "ravi", 27);
		Student obj2 = new Student(1, "ranju", 22);
		Student obj3 = new Student(7, "ram", 12);
		
		
		ArrayList<Student> list = new ArrayList<>();
		
		
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		IdCompare com = new IdCompare();
		
		Collections.sort(list, com);
		
		for (Student student : list) {
			
			String s = student.toString();
			System.out.println(s);
		}
		

	}

}
