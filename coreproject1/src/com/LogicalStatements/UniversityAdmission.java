package com.LogicalStatements;

import java.util.Scanner;

public class UniversityAdmission {

	public static void main(String[] args) {
		System.out.println("University Admission System");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		String name = sc.next();
		sc.nextLine();
		System.out.println("Enter Roll Number : ");
		int rollno = sc.nextInt();
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("You are eligible for admission");

			System.out.println("Enter you'r Gender:  ");
			char gender = sc.next().charAt(0);

			System.out.println("Enter your category: ");
			String category = sc.next();

			System.out.println("Enter your 10th Percentage : ");
			float percentage = sc.nextFloat();

			System.out.println("Enter your 12th Percentage : ");
			float percentage12 = sc.nextFloat();
			if (percentage12 >= 7.5) {
				System.out.println("You are granted for the B.tech");

				System.out.println("Enter your Entrance Exam Score : ");
				int entranceExam = sc.nextInt();
				if (entranceExam > 65) {
					System.out.println("You are eligible to continue...");

					System.out.println("Enter your English Marks : ");
					int eMarks = sc.nextInt();

					System.out.println("Enter your family income : ");
					double familyIncome = sc.nextDouble();

					if (familyIncome >= 1200000) {
						System.out.println("You are affordable to join B.Tech");

						System.out.println("Hostel require (true/false)");
						boolean hostelRequired = sc.nextBoolean();

						if (hostelRequired) {
							System.out.println("Join in the hostel");

							System.out.println("Disability status....");
							boolean disabilityStatus = sc.nextBoolean();

							if (disabilityStatus) {
								System.out.println("You can join in Handicaped quota");
							} else {
								System.out.println("You can join as a normal person..");
							}

						} else {
							System.out.println("come from the home/pg hostel");
						}

					} else {
						System.out.println("You can join in Govt.Degree college");
					}

				} else {
					System.out.println("You can leave for the day....");
				}
			} else {
				System.out.println("Go and Pass 12th class");
			}

		} else {
			System.out.println("You are not eligible!");
		}
		sc.close();
	}
}