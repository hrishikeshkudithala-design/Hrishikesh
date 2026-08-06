package com.LogicalStatements;

import java.util.Scanner;

public class TestLSDemo7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		if (age > 0 && age <= 5) {
			System.out.println("You are Kids");
		} else if (age >= 6 && age <= 12) {
			System.out.println("You are Children's");
		} else if (age >= 13 && age <= 19) {
			System.out.println("Hello Teens");
		} else if (age >= 20 && age <= 35) {
			System.out.println("Hello Young");
		} else if (age >= 35 && age <= 60) {
			System.out.println("Hello Middle Age People");
		} else {
			System.out.println("Old People");
		}
		sc.close();
	}
}