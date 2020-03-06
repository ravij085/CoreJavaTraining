package com.yessInfoTech.io;

import java.util.Scanner;

public class TestConsole {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your name : ");
		String name = scanner.nextLine();
		
		System.out.println("Enter your year of experiecne :");
		int exp = scanner.nextInt();
		System.out.println("Welcome to yess infotech "+name);
		System.out.println("your experiecen is: "+exp);
		
		

		scanner.close();

	}

}
