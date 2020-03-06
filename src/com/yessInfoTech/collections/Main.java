package com.yessInfoTech.collections;

import java.util.ArrayList;
import java.util.Collections;

class Main {
	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));

		
		ArrayList<Integer> intList  = new ArrayList<>();
		intList.add(5);
		intList.add(6);
		intList.add(2);
		
		Collections.sort(intList);
		
		System.out.println(intList);
		Collections.sort(list);
		

		System.out.println("Movies after sorting : ");
		for (Movie movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}
	}
}

