package com.LogicalStatements;

import java.util.Scanner;

public class SumOfEven {
	public static void main(String[] args) {
    System.out.println("main method started");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = sc.nextInt();
    int even = SEven(n);
    System.out.println("Sum Of Even numbers : "+even);
    sc.close();
	}
	static int SEven(int n) {
		int i = 2;
		int sum = 0;
		while(i<=n) {
			sum = sum + i;
			i = i + 2;
		}
		return sum;		
	}
}