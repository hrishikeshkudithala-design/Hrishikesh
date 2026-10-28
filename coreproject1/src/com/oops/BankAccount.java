package com.oops;

class BankAccount {

	private long accountNumber;
	private String holderName;
	private double balance;

	BankAccount(long accountNumber, String holderName) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = 5000;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposited Amount: " + amount);
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("Withdrawn amount : " + amount);
		} else {
			System.out.println("Insufficient Balance: ");
		}
	}

	public void displayBalance() {
		System.out.println("Final Balance: " +balance);
	}

	public static void main(String[] args) {
		BankAccount ba = new BankAccount(12345678, "Hrishikesh");
		ba.deposit(2000);
		ba.withdraw(1500);
		ba.displayBalance();
	}
}