package com.Arrays;

public class Array1 {

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] ages;// Step 1: Declaration
		ages = new int[5];

		ages[0] = 21;
		ages[1] = 22;
		ages[2] = 17;
		ages[3] = 18;
		ages[4] = 22;

		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
	}
}