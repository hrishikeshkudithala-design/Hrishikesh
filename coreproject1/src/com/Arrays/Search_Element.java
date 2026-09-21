package com.Arrays;

import java.util.Scanner;

public class Search_Element {

	public static void main(String[] args) {
    int[] arr = {18, 7, 45, 1, 10, 33, 9, 8};
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number : ");
    
    int search = sc.nextInt();
    boolean status = false;
    
    for(int a: arr) {
    	  if(a == search) {
    		  System.out.println("The Element is found : "+a);
    		  status = true;
    		  break;
    	  }
    }
    if(!status) {
    	System.out.println("The element is not found !!");
    }
    sc.close();
	}
}