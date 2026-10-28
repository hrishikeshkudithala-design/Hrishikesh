package com.oops;

public class ShoppingCart {
	
	private int cartItems;
	private double totalAmount;
	public void addItems(double price) {
		cartItems++;
		totalAmount += price;
	}

	public void removeItems(double price) {
		if(cartItems > 0) {
			cartItems--;
			totalAmount -= price;
		}
	}
	
	public double getTotal() {
		return totalAmount;
	}
	
	public static void main(String[] args) {
		ShoppingCart sc = new ShoppingCart();
		sc.addItems(100.5);
		sc.addItems(290.25);
		sc.addItems(500.75);
		sc.removeItems(290.25);
//		System.out.println("CartItems : "+sc.addItems());
		System.out.println("Total Amount : "+sc.getTotal());
	}
}