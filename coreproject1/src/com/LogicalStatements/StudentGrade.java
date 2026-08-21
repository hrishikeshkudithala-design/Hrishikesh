package com.LogicalStatements;

import java.util.Scanner;

public class StudentGrade {
   String gradeInfo(double marksP) {
	   String grade = "";
	   if(marksP>100 || marksP<0) {
		   System.out.println("Invalid Marks Percentage : ");
	   }else if(marksP>35) {
		   grade = "Just Passed P";
	   }else if(marksP>60) {
		   grade = "Ok-D";
	   }else if(marksP>70) {
		   grade = "Avg - C";
	   }else if(marksP>80) {
		   grade = "Good - B";
	   }else if(marksP>90) {
		   grade = "Excellent - A";
	   }else {
		   grade = "Failed - F";
	   }
	   return grade;
   }
	
	 void main() {
		System.out.println("main method started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks Percentage % : ");
        double marksP = sc.nextDouble();
        String grade = gradeInfo(marksP);
        
        System.out.println("Student Grade based on his Marks P : "+grade);
        sc.close();
	}
}