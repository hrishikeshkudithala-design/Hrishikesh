package com.oops;
class Employee {
	
	private int id;
	private String name;
	private double salary;
	private String password;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salary) {
		this .salary = salary;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getPassword() {
		return password;
	}	
	public static void main(String[] args) {  
		Employee e = new Employee();
		e.setId(101);
		e.setName("Hrishikesh");
		e.setSalary(50000);
		e.setPassword("123456");
		System.out.println("ID : "+e.getId());
		System.out.println("Name : "+e.getName());
		System.out.println("Salary : "+e.getSalary());
		System.out.println("Password : "+e.getPassword());
		e.setSalary(60000);
		System.out.println("Updated Salary : "+e.getSalary());
	}
}