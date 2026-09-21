package com.Arrays;

import java.util.Scanner;

public class Operations_Matrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                int start = 0;
                int end = arr[i].length - 1;
                while (start < end) {
                    int temp = arr[i][start];
                    arr[i][start] = arr[i][end];
                    arr[i][end] = temp;
                    start++;
                    end--;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (i != j) {
                        arr[i][j] = arr[i][j] * 2;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = arr[i][i] * arr[i][i];
        }
        System.out.println("Modified Matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}