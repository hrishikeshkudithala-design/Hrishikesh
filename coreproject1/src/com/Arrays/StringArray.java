package com.Arrays;

public class StringArray {

	public static void main(String[] args) {
		System.out.println("main method started");
		String[] names = new String[5];

		names[0] = "Dhoni";
		names[1] = "Virat";
		names[2] = "Rohit";
		names[3] = "Rahul";
		names[4] = "Hardik";
		// names[5] = "Srikanth";
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("main method ended");
	}
}