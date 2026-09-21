package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReadingSize {

	public static void main(String[] args) {
    System.out.println("main method started");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Size : ");
    int size = sc.nextInt();
    
    int[] numbers = new int[size];
    
    System.out.println("Enter the elements: ");
    for(int i = 0; i < size; i++) {
    	  numbers[i] = sc.nextInt();
    }
    for(int i = 0; i < size; i++) {
    	if(numbers[i] % 2 == 0) {
    		System.out.print(numbers[i] + " ");
    	}
    }
    System.out.println();
    System.out.println(Arrays.toString(numbers));
    sc.close();
	}
}