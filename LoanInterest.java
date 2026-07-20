package coreproject1;
import java.util.Scanner;
public class LoanInterest {
	double calculateInterest(double principal, double rate, int time) {
		return (principal*rate*time)/100;
	}
	
	
	
	 void main(String[] args) {
    System.out.println("main method started");
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Principal Amount: ");
    double principal = sc.nextDouble();
    
    System.out.println("Enter Rate of Interest: ");
    double rate = sc.nextDouble();
    
    System.out.println("Enter Time: ");
    int time = sc.nextInt();
    
    double Interest= calculateInterest(principal,rate,time);
    
    System.out.println("Simple Interest: "+Interest);
    System.out.println("main method ended");
	}

}
