package com.LogicalStatements;

import java.util.Scanner;

public class TestLSDemo5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Marks : ");
		int sm = sc.nextInt();
		if (sm >= 35) {
			System.out.println("Student is Pass!");
		} else {
			System.out.println("Student is Fail!");
		}
		sc.close();
	}
}