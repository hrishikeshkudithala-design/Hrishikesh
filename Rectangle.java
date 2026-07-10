package coreproject1;
public class Rectangle {
void calculateArea() {
    	int length = 10;
    	int breadth = 20;
    	int area = length * breadth;
    	System.out.println(area);
    }

	public static void main(String[] args) {
    Rectangle r = new Rectangle();
    System.out.println("Displaying the result..");
    r.calculateArea();
	}
}