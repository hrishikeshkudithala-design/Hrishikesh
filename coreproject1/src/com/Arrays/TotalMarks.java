package com.Arrays;

public class TotalMarks {

	public static void main(String[] args) {
    System.out.println("main method started");
    
    int[] marks = { 99, 98, 97, 96, 95, 94};
  //  System.out.println(marks);
    
    int total_marks = 0;
    double avg = 0;
    
    for(int i = 0 ; i < marks.length; i++) {
    	  total_marks = total_marks + marks[i];
    }
    
  //  for(int m : marks) {
  //  	 total_marks = total_marks + m;
  //  }
    
    avg = total_marks/marks.length;
    
    System.out.println("Total marks of the student : "+total_marks);
    System.out.println("Avg marks : " + avg);
	}
}