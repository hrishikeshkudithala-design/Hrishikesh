package com.Arrays;

import java.util.Scanner;

public class SumOfMatrix {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] numbers = new int[3][3];
		int sum = 0;
		System.out.println("Enter array elements : ");
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				numbers[i][j] = sc.nextInt();
				sum = sum + numbers[i][j];
			}
		}
		sc.close();
		System.out.print("Sum = "+sum);
		
//		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//		int sum = 0;
//		for(int i = 0; i<arr.length;i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				sum = sum + arr[i][j];
//			}
//		}
//		System.out.print("sum = "+sum);
	}
}