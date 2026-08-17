package com.LogicalStatements;

import java.util.Scanner;

public class DecimalToBinary {

	void decimalToBinary(int n) {

		int r = 0;
		String binVal = "";

		while (n > 0) {
			r = n % 2;
			n = n / 2;
			binVal = r + binVal;
		}
		System.out.println("The Binary Value of a given number is : " + binVal);
	}

	void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();

		decimalToBinary(n);
		System.out.println("main method ended");
		sc.close();
	}
}