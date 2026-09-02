package com.LogicalStatements;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
    System.out.println("main method started");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = sc.nextInt();
    int digits = sumOfDigits(n);
    System.out.println("Sum Of Digits : "+digits);
    
    System.out.println("main method ended");
    sc.close();
	}
	static int sumOfDigits(int n) {
		int sum = 0;
		for(;n>0;n=n/10) {
			sum = sum + (n%10);
		}
		return sum;
	}
}