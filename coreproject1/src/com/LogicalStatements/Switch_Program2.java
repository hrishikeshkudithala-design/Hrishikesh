package com.LogicalStatements;

import java.util.Scanner;

public class Switch_Program2 {

	public static void main(String[] args) {
		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);
		
		String yn = "";
		
		System.out.println("Enter a number : ");
		int a = sc.nextInt();

		System.out.println("Enter b number : ");
		int b = sc.nextInt();

		System.out.println("Enter a Symbol !!");
		String symb = sc.next();

		do {
			switch (symb) {
			case "+" -> System.out.println(a + b);
			case "-" -> System.out.println(a - b);
			case "*" -> System.out.println(a * b);
			case "/" -> System.out.println(a / b);
			case "%" -> System.out.println(a % b);

			default -> System.out.println("Entered unknown symbol to proceed !!");
			}
			
			System.out.println("Do you want to Continue..? Click Y for Yes N for No");
			yn = sc.next();
		} while(yn.equalsIgnoreCase("Y"));
		
		System.out.println("EXIT!!");
		sc.close();
	}
}