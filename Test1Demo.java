package coreproject1;
public class Test1Demo {
	public static void main(String[] args) {
    System.out.println("main method started");
     method1();
	}
	static void method1() {
		method2();
		System.out.println("Hello method1");
	}
	static void method2() {
		Test1Demo t = new Test1Demo();
		t.method3();
		System.out.println("Hello method2");
	}
		void method3() {
			method4();
			System.out.println("Hello method3");
		}
		void method4() {
			System.out.println("Hello method4");
		}
}		