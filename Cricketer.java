package coreproject1;
public class Cricketer {
int jerseyNo;
String cricketerName;
int age = 21;
static int countryId = 91;
static String countryName = "India";
public static void main(String[] args) {
	System.out.println("Welcome to Indian Cricket Team");
	System.out.println("Object1 info***********");
	Cricketer msd = new Cricketer();
	msd.jerseyNo = 7;
	msd.cricketerName="Mahendra Singh Dhoni";
	System.out.println("Country ID: "+ countryId);
	System.out.println("Country Name: "+countryName);
	System.out.println("Jersey Number: "+msd.jerseyNo);
	System.out.println("Name of the Cricketer: "+msd.cricketerName);
	
	System.out.println("Object2 info***********");
	Cricketer virat = new Cricketer();
	virat.jerseyNo = 18;
	virat.cricketerName="Virat Kohli";
	System.out.println("Country ID: "+ countryId);
	System.out.println("Country Name: "+countryName);
	System.out.println("Jersey Number: "+virat.jerseyNo);
	System.out.println("Name of the Cricketer: "+virat.cricketerName);
	
	System.out.println("Object3 info***********");
	Cricketer rohit = new Cricketer();
	rohit.jerseyNo = 45;
	rohit.cricketerName="Rohit hitman";
	System.out.println("Country ID: "+ countryId);
	System.out.println("Country Name: "+countryName);
	System.out.println("Jersey Number: "+rohit.jerseyNo);
	System.out.println("Name of the Cricketer: "+rohit.cricketerName);
}
}