package com.LogicalStatements;

public class SumOfNumbers {

	public static void main(String[] args) {
    System.out.println("main method started!");
    int sum = 0;
    for(int i= 1;i<=100;i++) {
    	 sum = sum + i;
    }
    System.out.println("Sum "+sum);
	}
}