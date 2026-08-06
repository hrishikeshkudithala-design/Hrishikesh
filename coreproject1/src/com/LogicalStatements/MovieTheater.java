package com.LogicalStatements;

import java.util.Scanner;

public class MovieTheater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Ticket Type : ");
		System.out.println("1.Silver-Rs.200");
		System.out.println("2.Gold-Rs.300");
		System.out.println("3.Platinum-Rs.500");
		System.out.println("4.Exit");
		System.out.println("--------------------");
		while (true) {
			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();
			if (choice > 3) {
				System.out.println("thanks visit again");
				break;
			}
			System.out.println("Enter Your Age: ");
			int age = sc.nextInt();
			switch (choice) {
			case 1:
				int price = 200;
				String ticketType = "Silver";
				System.out.println("Ticket Price : " + price);
				System.out.println("Ticket Type : " + ticketType);
				if (age >= 65) {
					price = price - (price * 10 / 100);
				}
				System.out.println("Silver Ticket Price: " + price);
				System.out.println("Thank You 😊😊😊!! Visit Again");
				break;
			case 2:
				int price1 = 300;
				String ticketType2 = "Gold";
				System.out.println("Ticket Price : " + price1);
				System.out.println("Ticket Type : " + ticketType2);
				if (age >= 65) {
					price1 = price1 - (price1 * 10 / 100);
				}
				System.out.println("Gold Ticket Price : " + price1);
				System.out.println("Thank You 😊😊😊!! Visit Again");
				break;
			case 3:
				int price2 = 500;
				String ticketType3 = "Platinum";
				System.out.println("Ticket Price : " + price2);
				System.out.println("Ticket Type : " + ticketType3);
				if (age >= 65) {
					price1 = price2 - (price2 * 10 / 100);
				}
				System.out.println("Platinum Ticket Price : " + price2);
				System.out.println("Thank You 😊😊😊!! Visit Again");
				break;
			default:
				System.out.println("Invalid choice enter again");
				sc.close();
			}
		}
	}
}