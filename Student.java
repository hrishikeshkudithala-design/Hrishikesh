package coreproject1;
public class Student {
	int sid;
	String sname;
	
	static int collegeid;
	static String collegename;
	
	public static void main(String[] args) {
       System.out.println("main method started!");
       System.out.println("Student information from vcube");
       
     System.out.println(collegeid);
     System.out.println(collegename);
     
     Student charan = new Student();
     System.out.println(charan.sid);
     System.out.println(charan.sname);
	}
}