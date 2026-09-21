package com.Arrays;

public class ReverseOrder {

	public static void main(String[] args) {
    int[] arr = {4, 5, 6, 7, 8, 1, 2, 3};
    
    for(int i = arr.length-1; i>=0; i--) {
    	System.out.print(arr[i] + " ");
    }
	}
}