package com.Arrays;

public class Array_2D_Representation {

	public static void main(String[] args) {
		int[][] numbers = new int[3][4];

		System.out.println(numbers.length);

		numbers[0][0] = 10;
		numbers[0][1] = 20;
		numbers[0][2] = 30;
		numbers[0][3] = 40;

		numbers[1][0] = 50;
		numbers[1][1] = 60;
		numbers[1][2] = 70;
		numbers[1][3] = 80;
		
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		

//		for (int[] n1 : numbers) {
//			for (int n : n1)
//				System.out.print(n + " ");
//		}
//		System.out.println();
	}
}