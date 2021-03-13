package com.meritamerica.assignment3;

public class CheckingAccount extends BankAccount {
    // Class Constant
    private static final double INTEREST_RATE = 0.0001;

    // Constructor with parameters
    public CheckingAccount(double openingBalance) {
	super(openingBalance, INTEREST_RATE);
    }

    public String toString() {
	String output = "Checking Account Balance: $" + this.getBalance() + "\n";
	output += "Checking Account Interest Rate: " + String.format("%.4f", this.getInterestRate()) + "\n";
	output += "Checking Account Balance in 3 years: $" + String.format("%.2f", this.futureValue(3));
	return output;
    }
}