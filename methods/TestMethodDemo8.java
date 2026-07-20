package coreproject1.methods;

import java.util.Scanner;

public class TestMethodDemo8 {

  double findAreaOfRectangle(double length, double breadth){
		return length * breadth;
	}
	
  double findAreaOfTriangle(float base, float height) {
	  return 0.5*base*height;
  }
  
  int findAreaOfSquare(double side) {
	  double arsq = side * side;
	  return (int)arsq;
  }
  
  double findAreaOfCircle(double radius) {
	  double arCir = Math.PI*radius*radius;
	  return arCir;
  }
  
  
  
  void main(String[] args) {
    System.out.println("main method started");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Length : ");
	double l = sc.nextDouble();
	System.out.println("Enter Breadth : ");
	double b = sc.nextDouble();
	
	double aRec = findAreaOfRectangle(l,b);
	System.out.println("Area of Rectangle is : "+aRec);
	
	System.out.println("Enter Radius : ");
	double r = sc.nextDouble();
	
	double aCir = findAreaOfCircle(r);
	System.out.println("Area of Circle is : "+aCir);
	
	System.out.println("Enter Base : ");
	double base = sc.nextDouble();
	
	System.out.println("Enter Height : ");
	double height = sc.nextDouble();
	double aTri = findAreaOfTriangle((float)base,(float)height);
	System.out.println("Area of Triangle is : "+aTri);
	
	System.out.println("Enter Side : ");
	double side= sc.nextDouble();
	int arsq = findAreaOfSquare(side);
	System.out.println("Area of Square is : "+arsq);
	}

}
