package com.Arrays;

import java.util.Scanner;

public class SumOfDiagonalElements {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		int[][] numbers = new int[3][3];
		int leftsum = 0;
		int rightsum = 0;
		System.out.println("Enter array elements : ");
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length; j++) {
				numbers[i][j] = sc.nextInt();
				if(i==j) {
				leftsum = leftsum + numbers[i][j];
				}
				if(i+j==2) {
					rightsum = rightsum + numbers[i][j];
				}
			}
		}
		System.out.println("LeftSum = "+leftsum);
		System.out.println("RightSum = "+rightsum);
		sc.close();
  }
}
