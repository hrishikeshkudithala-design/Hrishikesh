package coreproject1;
import java.util.Scanner;
public class StudentResult {
	void displayStudent(String name) {
		System.out.println("Student Name: "+name);
	}
	void calculateTotal(int m1, int m2, int m3) {
		int total = m1+m2+m3;
		System.out.println("Total Marks = "+total);
	}
	void calculateAverage(int m1, int m2 , int m3) {
		double average= (m1+m2+m3)/3.0;
		System.out.println("Total Average = "+average);
	}
	 void main() {
    System.out.println("Main method Started!");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Student Name: ");
    String name =sc.nextLine();
    System.out.println("Enter Marks of first subject: ");
    int m1 = sc.nextInt();
    System.out.println("Enter Marks of second subject: ");
    int m2 = sc.nextInt();
    System.out.println("Enter Marks of third subject: ");
    int m3 = sc.nextInt();
    displayStudent(name);
    calculateTotal(m1,m2,m3);
    calculateAverage(m1,m2,m3);
    System.out.println("Main method Ended!");
    sc.close();
	}
}