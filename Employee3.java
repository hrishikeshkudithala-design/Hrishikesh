package coreproject1;
public class Employee3 {
  int EmployeeId=1;
  char EmployeeGrade='A';
  float EmployeeSalary=45000;
  int EmployeeExperience=2;
  int WorkingDays=7;
  long PhoneNumber=977877709L;
  float BonusAmount=30000;
  
	public static void main(String[] args) {
	System.out.println("Employee Details: ");	
    Employee3 e3 = new Employee3();
	System.out.println(e3.EmployeeId);	
	System.out.println(e3.EmployeeGrade);
	System.out.println(e3.EmployeeSalary);
	System.out.println(e3.EmployeeExperience);
	System.out.println(e3.WorkingDays);
	System.out.println(e3.PhoneNumber);
	System.out.println(e3.BonusAmount);			
	}
}
