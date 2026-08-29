package com.LogicalStatements;

import java.util.Scanner;

public class PerfectNumber {

  void main(String[] args) {
     System.out.println("main method started");
     
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number to find Perfect or not");
     int n = sc.nextInt();
     
    boolean status = isPerfect(n);
     
     if(status) {
    	   System.out.println("The Given number is Perfect");
     }else {
    	   System.out.println("The Given number is not Perfect");
     }
     System.out.println("main method ended");
     sc.close();
	}
	
	 boolean isPerfect(int n) {
		boolean flag = false;
		int sum = 0;		
		for(int i = 1;i <= n/2;i++) {
			if(n % i == 0) {
				sum = sum + i;
			}
		}	
		if(sum == n) {
			flag = true;
		}
		return flag;
	}
}