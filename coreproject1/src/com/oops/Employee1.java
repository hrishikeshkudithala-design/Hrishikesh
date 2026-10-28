package com.oops;

public class Employee1 {
    
	private int eid;
	private String ename;
	private double salary;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public Employee1() {
		
	}
	
	public Employee1(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public void setEid(int eid) {
		this.eid= eid;
	}
	
	public int getEid() {
		return eid;
	}
	
	public void setEname(String ename) {
		this .ename = ename;
	}
	
	public String getEname() {
		return ename + "-VCube";
	}
	
	public void setSalary(double salary) {
		if(salary>0) {
			this.salary = salary;
		}else {
			System.out.println("Invalid Salary Details");
		}
	}
	
	public double getSalary() {
		return salary;
	}
	
	public static void main(String[] args) {

	}
}