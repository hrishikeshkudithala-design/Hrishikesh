package coreproject1.methods;

import java.util.Scanner;
public class Calculator {

	int add(int a, int b) {
		System.out.println("Addition : ");
		return a + b;
	}
	
	int subtract(int a, int b) {
		System.out.println("Subtraction : ");
		return a - b;
	}
	
	int multiply(int a , int b) {
		System.out.println("Mulitiplication : ");
		return a * b;
	}
	
	int divide(int a , int b) {
		System.out.println("Division : ");
		return a / b;
	}
	
	
	
	 void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = sc.nextInt();
		System.out.println("Enter second number : ");
		int b = sc.nextInt();
		int add =add(a,b);  
		System.out.println(add);
		int subtract= subtract(a,b);
		System.out.println(subtract);
		int multiply = multiply(a,b);
		System.out.println(multiply);
		int divide = divide(a,b);
		System.out.println(divide);
		sc.close();
	}
}