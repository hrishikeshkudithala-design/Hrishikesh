package com.LogicalStatements;

import java.util.Scanner;

public class TestLSDemo13 {

	public static void main(String[] args) {
    System.out.println("main method started");
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your favourite Jersey Number : ");
    int jno = sc.nextInt();
    switch(jno) {
    case 7:
    	  System.out.println("Mahendra Singh Dhoni !!");
    	  System.out.println("Cool Captain !!");
    case 45:
    	  System.out.println("Rohit Sharma !!");
    	  System.out.println("Hitman India cha Raja");
    case 18:
    	  System.out.println("Virat Kohli !!");
    	  System.out.println("King is always a king & aggressive player");
    case 1:
    	  System.out.println("K L Rahul");
    	  System.out.println("Form is Temporary but Class is Permanent");
    case 33:
    	  System.out.println("Hardik Pandya");
    	  System.out.println("Attitude & All rounder");
    	 default:
    		 System.out.println("Unkown Player from the List!");
    }
    sc.close();
 }
}