package coreproject1;
public class WrapperClass {
	public static void main(String[] args) {
    String s = "1000";
    Integer i = Integer.parseInt(s);
    Float f = Float.parseFloat(s);
    Double d = Double.parseDouble(s);
    System.out.println(s);
    System.out.println(i);
    System.out.println(f);
    System.out.println(d);
	}
}