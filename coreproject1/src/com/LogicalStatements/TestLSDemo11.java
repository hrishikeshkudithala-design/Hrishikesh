package com.LogicalStatements;

import java.util.Scanner;

public class TestLSDemo11 {

	public static void main(String[] args) {
    System.out.println("****Job Interview****");
    Scanner sc = new Scanner(System.in);
    System.out.println("Do you have a degree? (true/false)");
    boolean hasDegree = sc.nextBoolean();
    if(hasDegree) {
    	 System.out.println("Do you know java? (true/false)");
    	 boolean knowsJava = sc.nextBoolean();
    	 if(knowsJava) {
    		 System.out.println("Do you have Projects?(true/false)");
    		 boolean hasProjects = sc.nextBoolean();
    		 if(hasProjects) {
    			 System.out.println("Eligible for Interview");
    		 }
    	 }else {
    		 System.out.println("Build Projects First!!!");
    	 }
    }else {
    	System.out.println("Complete your degree");
    }
    sc.close();
	}
}