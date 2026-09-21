package com.Arrays;

public class StudentMarksRound {

	public static void main(String[] args) {
		int[] arr = { 35, 41, 29, 72, 87 };
		for (int num : arr) {
			int rounded = Math.round(num / 10.0f) * 10;
			System.out.print(rounded + " ");
		}
	}
}