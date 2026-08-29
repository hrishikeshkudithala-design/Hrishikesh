package com.LogicalStatements;

import java.util.Scanner;

public class Matrimony {

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube Matrimonial !!");
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name : ");
		String name = sc.nextLine();
		System.out.println("Nice to meet you Mr. " + name);
		System.out.println("Can you add your assets value here!");
		double assets = sc.nextDouble();

		System.out.println("What is your salary : ");
		double salary = sc.nextDouble();

		if (assets >= 5000000.00 && salary >= 2500000.00) {
			System.out.println("Okay good to go !");
			System.out.println("Enter your age : ");
			int age = sc.nextInt();
			if (age >= 27 && age <= 29) {
				System.out.println("Lets Continue....");
				System.out.println("Enter your Height : ");
				float height = sc.nextFloat();
				System.out.println("Enter your weight : ");
				double weight = sc.nextDouble();

				if ((height >= 5.6 && height <= 6.0) && weight >= 65 && weight <= 70) {
					System.out.println("Okay, continue the discussion");

					System.out.println("Do you Smoke or Drink...?");
					boolean habStatus = sc.nextBoolean();

					if (!habStatus) {
						System.out.println("Great to Know!!");
						System.out.println("Do you have Siblings : ");
						boolean sibStatus = sc.nextBoolean();
						if (!sibStatus) {
							System.out.println("Okay Good to know !! we will Back soon!!");
						} else {
							System.out.println("OMG !!");
						}
					} else {
						System.out.println("Sorry!! you can leave");
					}
					sc.close();
				}
			}
		}
	}
}