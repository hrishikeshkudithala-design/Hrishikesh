package com.Arrays;

public class LeaderElements {

	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2 };
		int[] leaders = new int[arr.length];
		int count = 0;
		int max = arr[arr.length - 1];
		leaders[count++] = max;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
				leaders[count++] = max;
			}
		}
		System.out.print("Leader Elements: ");
		for (int i = count - 1; i >= 0; i--) {
			System.out.print(leaders[i] + " ");
		}
	}
}