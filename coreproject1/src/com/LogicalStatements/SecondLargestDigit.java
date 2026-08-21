package com.LogicalStatements;

import java.util.Scanner;

public class SecondLargestDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int largest = -1;
		int secondLargest = -1;
		for (; n > 0; n = n / 10) {
			int digit = n % 10;
			if (digit > largest) {
               secondLargest = largest;
               largest = digit;
			}else if(digit > secondLargest && digit != largest){
				secondLargest = digit;
			}
		}
		if(secondLargest == -1) {
			System.out.println("Second largest distinct digit does not exist");
		}else {
			System.out.println("Second Largest Digit = "+secondLargest);
		}
		sc.close();
	}
}