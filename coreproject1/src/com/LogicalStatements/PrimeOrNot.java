package com.LogicalStatements;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Number to check Prime or not");
      int num = sc.nextInt();
      int count = 0;
      for(int i = 1; i < num ; i++) {
    	   if(num%i==0) {
    		   count++;
    	   }
      }
      if(count == 1) {
    	   System.out.println("Given Number is prime");
      }else {
    	    System.out.println("Given number is not prime");
      }
      sc.close();
	}
}