package coreproject1;

import java.util.Scanner;

public class TestMethodsDemo6 {
	
	 static Scanner sc = new Scanner(System.in);
	
	double getSalary() {
		double sal = 0;
		System.out.println("Enter your salary : ");
		sal = sc.nextDouble();
		return sal;
	}
	
	double getBonus() {
		double bonus = 0;
		System.out.println("Enter your Bonus : ");
		bonus = sc.nextDouble();
		return bonus;
	}
	
	double getBasic() {
		double basic = 0;
		System.out.println("Enter your Basic : ");
		basic = sc.nextDouble();
		return basic;
	}
	
	double getHouseRentAllowance() {
		double HRA=0;
		System.out.println("Enter your HRA: ");
		HRA=sc.nextDouble();
		return HRA;
	}
	
	double getLeaveTravelAssistance() {
		double LTA = 0;
		System.out.println("Enter your LTA: ");
		LTA = sc.nextDouble();
		return LTA;
	}
	
	double getSpecialAllowance() {
		double sa = 0;
		System.out.println("Enter your Special Allowance: ");
		sa = sc.nextDouble();
		return sa;
	}
	
	double getMeal() {
		double m = 0;
		System.out.println("Enter your Meal Expenses: ");
		m = sc.nextDouble();
		return m;
	}
	
	double getProvidentFund() {
		double pf = 0;
		System.out.println("Enter your Provident Fund: ");
		pf = sc.nextDouble();
		return pf;
	}
	
	double getGratuity() {
		double g = 0;
		System.out.println("Enter your Gratuity: ");
		g=sc.nextDouble();
		return g;
	}
	
	double getPerformancePayOnAchievement() {
		double ppa = 0;
		System.out.println("Enter Performance Pay On Acheivement : ");
		ppa = sc.nextDouble();
		return ppa;
	}
	
	
	public static void main(String[] args) {
    System.out.println("main method started!");
    TestMethodsDemo6 t = new TestMethodsDemo6();
    double b = t.getBonus();
    double s = t.getSalary();
	System.out.println("Total Salary of the Employee : "+(b+s));	
	double ba = t.getBasic();
	System.out.println("Basic : "+ba);
	double HRA = t.getHouseRentAllowance();
	System.out.println("House Rent Allowance(HRA) : "+HRA);
	double LTA = t.getLeaveTravelAssistance();
	System.out.println("Leave Travel Assistance : "+LTA);
	double sa = t.getSpecialAllowance();
	System.out.println("Special Allowance : "+sa);
	double m = t.getMeal();
	System.out.println("Meal(Food Plus Cards) : "+m);
	double pf = t.getProvidentFund();
	System.out.println("Provident Fund : "+pf);
	double g = t.getGratuity();
	System.out.println("Gratuity(company contribution) : "+g);
	System.out.println("Total Fixed Compensation : "+(ba+HRA+LTA+sa+m+pf+g));
	double ppa = t.getPerformancePayOnAchievement();
	System.out.println("Performance Pay On Achievement Of Target : "+ppa);
	System.out.println("Total Annual Compensation : "+(ba+HRA+LTA+sa+m+pf+g+ppa));
	}
}