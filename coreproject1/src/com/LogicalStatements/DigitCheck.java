package com.LogicalStatements;

import java.util.Scanner;

public class DigitCheck {

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number : ");
     int num = sc.nextInt();
     if(num>0 && num <=9) {
    	 System.out.println("One digit number");
     }
     else if(num>=10 && num<=99){
    	    System.out.println("Two digit number");
     }
     else if(num>=100 && num<=999){
    	  System.out.println("Three digit number");
     }
     else if(num>=1000 && num <= 9999){
    	  System.out.println("Four digit number");
     }
     else {
    	  System.out.println("Number is Invalid");
     }
     sc.close();
	}
}