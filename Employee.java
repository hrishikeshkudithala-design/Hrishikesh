package coreproject1;
public class Employee {
	
	int eid;
	String name;
	
	static int orgId;
	static String orgName;
	
	public static void main(String[] args) {
       System.out.println("main method started from Employee!");
       Employee e1 = new Employee();
       System.out.println(orgId);   
       System.out.println(orgName);
       System.out.println(e1.eid);
       System.out.println(e1.name);
       System.out.println(Employee.orgId);
       System.out.println(Employee.orgName);
	}

}
