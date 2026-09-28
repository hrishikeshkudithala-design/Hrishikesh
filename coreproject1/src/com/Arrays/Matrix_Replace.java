package com.Arrays;
import java.util.Scanner;
public class Matrix_Replace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		System.out.println("Enter Array elements: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Array elements: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] % 2 == 0) {
					arr[i][j] = 0;
				} else {
					arr[i][j] = -1;
				}
			}
		}
		System.out.println("Modified Matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}

