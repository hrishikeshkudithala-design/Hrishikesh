package com.Arrays;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i<arr.length; i++) {
	    	System.out.println("Enter the Elements: ");
	    	arr[i] = sc.nextInt();
	    }
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum = "+sum);
		double average = (double)sum/arr.length;
		System.out.println("Average = "+average);
		sc.close();
	}
}