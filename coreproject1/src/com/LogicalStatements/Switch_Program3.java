package com.LogicalStatements;

import java.util.Scanner;

public class Switch_Program3 {
	
static String findGradeInfo(double marksP) {
		
		int m = (int)(marksP/10);
		String grade = "";
		
		grade = switch (m) {
		case 9->grade = "A";
		case 8->grade =	"B";
		case 7->grade = "C";
		case 6->grade = "D";
		case 5,4->grade="P";
		
		
		default -> grade = "F";
		};	
		return grade;
	}
	public static void main(String[] args) {
    System.out.println("main method started");   
    Scanner sc = new Scanner(System.in);
    double marksP = sc.nextDouble();  
    String grade = findGradeInfo(marksP); 
    System.out.println("Student Grade is "+grade);
    sc.close();
	}
}