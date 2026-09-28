package com.Arrays;

public class JaggedArray {

	public static void main(String[] args) {
    int[][] arr = new int[2][];
    
    arr[0] = new int[3];
    arr[1] = new int[4];
    
    
    arr[0][0] = 100;
    arr[0][1] = 101;
    arr[0][2] = 102;
    
    
    arr[1][0] = 103;
    arr[1][1] = 104;
    arr[1][2] = 105;
    arr[1][3] = 106;
    
    for(int i = 0; i < arr.length; i++) {
    	  for(int j = 0; j < arr[i].length; j++) {
    		  System.out.print(arr[i][j] + " ");
    	  }
    	  System.out.println();
    }
    
	}
}