package com.LogicalStatements;

public class EvenAndOdd {

	public static void main(String[] args) {
    for(int i = 0; i <= 50 ; i++) {
    	  if(i != 0 && i % 2 == 0) {
    		  System.out.print(i+" ");
    	  }
    }
    System.out.println();
    System.out.println("*******************************************");
    for(int i = 0; i <= 50; i++) {
    	  if(i != 0 && i % 2 == 1) {
    		  System.out.print(i+" ");
    	  }
    }
	}
}