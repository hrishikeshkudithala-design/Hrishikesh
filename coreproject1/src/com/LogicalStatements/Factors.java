package com.LogicalStatements;

import java.util.Scanner;

public class Factors {

	static void findFactors(int n) {
		
		for(int i = 1; i <= n/2 ; i++) {
			if(n % i == 0) {
				System.out.print(i+" ");
			}
		}
	    System.out.println(n);
	}
	
	public static void main(String[] args) {
    System.out.println("main method started");
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to find factors : ");
    int n = sc.nextInt();
    
    findFactors(n);
    
    System.out.println("main method ended");
    sc.close();
	}
}