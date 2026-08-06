package com.LogicalStatements;

import java.util.Scanner;

public class TestLSDemo10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you attending the classes daily..?");
		boolean areYouAttendingClasses = sc.nextBoolean();

		if (areYouAttendingClasses) {
			System.out.println("You will understand the classes easily");

			boolean areYouAttendingWeeklyExams = sc.nextBoolean();

			if (areYouAttendingWeeklyExams) {
				System.out.println("You can complete any written test easily you will get more opportunities");

				boolean areYouAttendingMocks = sc.nextBoolean();

				if (areYouAttendingMocks) {
					System.out.println("You will get job if you attend 20+ mocks without a doubt");
				} else {
					System.out.println("Don't waste your time if you are not attending mocks");
				}

			} else {
				System.out.println("You came to Hyd for Entertainment but not for job!!");
			}

		} else {
			System.out.println("You must need to go to Temple !! God will save you !");
		}
		sc.close();
	}
}