package coreproject1;
public class PersonalInformation {
	 void main(String[] args) {
     System.out.println("main method started!");
     getName("Hrishikesh");
     getAge(22);
     getGender('M');
     getCity("Warangal");
     getState("Hanamkonda");
     getPincode(500018);
     getCollegeName("Kitsw","Warangal");
     getCourse("CSE");
     getPercentage(81.9);
     getPassOfYear(2026);
     getBankName("ICICI");
     getAccountNumber(65444490);
     getBalance(30000);
     System.out.println("main method ended!");
	}
 void getName(String name) {
	 System.out.println("Name: "+name);
 }
 void getAge(int age) {
	 System.out.println("Age: "+age);
 }
 void getGender(char G) {
	System.out.println("Gender: "+G); 
 }
 void getCity(String city) {
	 System.out.println("City: "+city);
 }
	void getState(String State) {
		System.out.println("State: "+State);
	}
    	void getPincode(int pincode) {
    		System.out.println("Pincode: "+pincode);
    	}
    	void getCollegeName(String CN, String location) {
    		System.out.println("CollegeName: "+ CN +"Location: "+location);
    	}
    	void getCourse(String course) {
    		System.out.println("Course: "+course);
    	}
    	void getPercentage(double Percentage) {
    		System.out.println("Percentage: "+Percentage);
    	}
    	void getPassOfYear(int POY) {
    		System.out.println("PassOutYear: "+POY);
    	}
    	void getBankName(String BankName) {
    		System.out.println("------BankDetails----");
    		System.out.println("BankName: "+BankName);
    	}
    	void getAccountNumber(long accountNumber) {
    		System.out.println("accountNumber: "+accountNumber);
    	}
    	void getBalance(double balance) {
    		System.out.println("Balance is : "+balance);
    	}
}