package com.LogicalStatements;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + n * i);
		}
		System.out.println("*************");
		for (char ch = 'Z'; ch >= 'A'; ch--) {
			System.out.print(ch + " ");
		}
		sc.close();
	}
}