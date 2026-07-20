package coreproject1;
import java.util.Scanner;
public class TestMethodsDemo5 {
   void getName(String fname, String lname) {
	   System.out.println("Employee Full Name :"+fname+" "+lname);
   }
   
   void getAge(int age) {
	   System.out.println("Age of the Employee: "+age);
   }
   
   void salaryInfo(double salary) {
	   System.out.println("Employee Salary is : "+salary);
   }
   
   void heightAndWeightInfo(float height, double weight) {
	System.out.println("Employee Height : "+height);
	System.out.println("Employee Weight:  "+weight);
   }
   
   void genderInfo(char c) {
	   System.out.println("Gender is : "+c);
   }
   
   void getAddress(String s) {
	   System.out.println("Address of the Employee : "+s);
   }
   
   void getNationality(String n) {
	   System.out.println("Nationality of the Employee: "+n);
   }
   
   void getCity(String city) {
	   System.out.println("City of the Employee: "+city);
   }
   
   void getBloodGroup(char bg) {
	   System.out.println("BloodGroup of the Employee: "+bg);
   }
   
   void verifyEmail(String e) {
	   System.out.println("Email of the Employee: "+e);
   }
   
   void shiftDetails(String sd) {
	   System.out.println("ShiftDetails of the Employee: "+sd);
   }
   
   void projectName(String p) {
	   System.out.println("Project Name: "+p);
   }
   
   void workLocation(String wl) {
	   System.out.println("WorkLocation of the Employee: "+wl);
   }
   
   void getStudentName(String sn) {
	   System.out.println("Name of the Student: "+sn);
   }
   
   void getRollNumber(int roll) {
	   System.out.println("Student rollNo: "+roll);
   }
   
   void studentAge(int age) {
	   System.out.println("Age of the Student: "+age);
   }
   
   void getGrade(char g) {
	   System.out.println("Grade of the Student: "+g);
   }
   
   void getCollegeName(String cn) {
	   System.out.println("College Name : "+cn);
   }
   
   void getProductName(String pn) {
	   System.out.println("Product Name : "+pn);
   }
   
   void getProductPrice(double pp) {
	   System.out.println("Product Price : "+pp);
   }
   
   void getPatientName(String pname) {
	   System.out.println("Patient Name: "+pname);
   }
   
   
   
   
   
   
   
	 void main() {
      System.out.println("main method started!");
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your age : ");
      int age = sc.nextInt();
      
      System.out.println("Enter your First Name : ");
      sc.nextLine();
      String firstName = sc.nextLine();
      
      System.out.println("Enter your Last Name : ");
      String lastName=sc.next();
      
      System.out.println("Enter your salary info : ");
      double sal = sc.nextDouble();
      
      System.out.println("Enter your Gender : ");
      char c = sc.next().charAt(0);
      
      System.out.println("Enter your height: ");
      float h = sc.nextFloat();
      
      System.out.println("Enter your weight: ");
      float w = sc.nextFloat();
      
      System.out.println("Enter your address: ");
      String s = sc.next();
      
      System.out.println("Enter your Nationality: ");
      String  n = sc.next();
      
      System.out.println("Enter your city: ");
      String city = sc.next();
      
      System.out.println("Enter your BloodGroup: ");
      char bg = sc.next().charAt(0);
      
      System.out.println("Enter your Email : ");
      String e = sc.next();
      
      System.out.println("Enter your ShiftDetails: ");
      String sd = sc.next();
      
      System.out.println("Enter project Name: ");
      String p = sc.next();
      
      System.out.println("Enter WorkLocation of the Employee: ");
      String wl = sc.next();
      
      System.out.println("Enter the Student Name: ");
      String sn = sc.next();
      
      System.out.println("Enter the Student RollNo: ");
      int roll = sc.nextInt();
      
      System.out.println("Enter the Age of Student: ");
      int a = sc.nextInt();
      
      System.out.println("Enter the Grade of Student: ");
      char g = sc.next().charAt(0);
      
      System.out.println("Enter the CollegeName: ");
      String cn = sc.next();
      
      System.out.println("Enter the ProductName: ");
      String pn = sc.next();
      
      System.out.println("Enter the ProductPrice: ");
      double pp = sc.nextDouble();
      
      System.out.println("Enter the PatientName: ");
      String pname = sc.next();
      
      
      
      getAge(age);
      getName(firstName,lastName);
      salaryInfo(sal);
      heightAndWeightInfo(h,w);
      genderInfo(c);
      getAddress(s);
      getNationality(n);
      getCity(city);
      getBloodGroup(bg);
      verifyEmail(e);
      shiftDetails(sd);
      projectName(p);
      workLocation(wl);
      getStudentName(sn);
      getRollNumber(roll);
      studentAge(age);
      getGrade(g);
      getCollegeName(cn);
      getProductName(pn);
      getProductPrice(pp);
      getPatientName(pname);
      
      
      
      
      System.out.println("main method ended!");
	}
}