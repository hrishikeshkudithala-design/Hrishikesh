package coreproject1;
public class Employee2 {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is Going to destroyed before that finalize method is called");
	}
	public static void main(String[] args) {
     Employee2 e2 = new Employee2();
     Employee2 e3 = new Employee2();
     System.out.println(e2);
     System.out.println(e3);
     e2 = null;
     e3=null;
     System.gc();
	}
}