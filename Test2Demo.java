package coreproject1;
public class Test2Demo {
	static int count = 0;
	{
		count++;
	}
	public static void main(String[] args) {
    Test2Demo t2 = new Test2Demo();
    Test2Demo t3 = new Test2Demo();
    Test2Demo t4 = new Test2Demo();
    System.out.println("Number of Objects: "+count);
	}
}