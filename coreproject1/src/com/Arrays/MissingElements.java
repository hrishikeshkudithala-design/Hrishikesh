package com.Arrays;

import java.util.Scanner;

public class MissingElements {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a size : ");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter array elements: ");
    for(int i = 0; i < size; i++) {
    	   arr[i] = sc.nextInt();
    }
    System.out.println("Enter start value : ");
    int start = sc.nextInt();
    System.out.println("Enter end value: ");
    int end = sc.nextInt();
    System.out.println("Array elements + Missing elements: ");
    for(int i = start; i<=end;i++) {
    	boolean found = false;
    	for(int j = 0;j<size;j++) {
    		if(arr[j]==i) {
    			found = true;
    			break;
    		}
    	}
    	if(!found) {
    		System.out.print(i+" ");
    	}
    }
    sc.close();
	}
}