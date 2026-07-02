package coreproject1;
public class Student100 {
	int studentId;
	String studentName;
	int age;
	String address;
	public static void main(String[] args) {
       System.out.println("Displaying Student Details...");
       System.out.println("Object1 info*********");
       Student100 s1 = new Student100();
       s1.studentId=10;
       s1.studentName="Charan";
       s1.age=20;
       s1.address="Warangal";
       System.out.println("StudentId: "+s1.studentId);
       System.out.println("StudentName: "+s1.studentName);
       System.out.println("Age: "+s1.age);
       System.out.println("Address: "+s1.address);
       Student100 s2 = new Student100();
       s2.studentId=11;
       s2.studentName="Kiran";
       s2.age=21;
       s2.address="Hyderabad";
       System.out.println("StudentId: "+s2.studentId);
       System.out.println("StudentName: "+s2.studentName);
       System.out.println("Age: "+s2.age);
       System.out.println("Address: "+s2.address);
       
       
       
       
	}
}