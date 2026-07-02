package coreproject1;
public class Employee1 {
	static String companyName;
	static String Location;
	String employeeName;
	int salary;
	static {
		 companyName = "TCS";
		 Location = "Hyderabad";
	}
	public static void main(String[] args) {
		System.out.println("Displaying the details of Employees...");
		Employee1 e1 = new Employee1();
		e1.employeeName="Charan";
		e1.salary=30000;
		Employee1 e2= new Employee1();
		e2.employeeName="Kiran";
		e2.salary=10000;
		System.out.println(companyName);
		System.out.println(Location);
		System.out.println("employeeName: "+e1.employeeName);
		System.out.println("salary: "+e1.salary);
		System.out.println("employeeName: "+e2.employeeName);
		System.out.println("salary: "+e2.salary);
	}
}