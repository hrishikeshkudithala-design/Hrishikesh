package com.LogicalStatements;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("Welcome to Elders community !!");
			System.out.println("You are Eligible for Voting & Driving !!");
		} else {
			System.out.println("Babu niku inka time undi ra !");
			System.out.println("Babu pakkaki velli aduko !!");
		}
		System.out.println("main method ended");
		sc.close();
	}
}
