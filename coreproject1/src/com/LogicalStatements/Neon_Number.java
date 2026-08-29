package com.LogicalStatements;

import java.util.Scanner;

public class Neon_Number {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int n = sc.nextInt();
	int square = n*n;
	int sum = 0;
	for(int temp=square;temp>0;temp=temp/10) {
		sum = sum + (temp%10);
	}
	if(sum==n) {
		System.out.println("The given number is Neon");
	}else {
		System.out.println("The given number is not Neon");
	}
	sc.close();
	}
}