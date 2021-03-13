package com.meritamerica.assignment3;

public class SavingsAccount extends BankAccount {
    // Class Constant
    private static final double INTEREST_RATE = 0.01;

    public SavingsAccount(double openingBalance) {
	super(openingBalance, INTEREST_RATE);
    }

    public String toString() {
	String output = "Savings Account Balance: $" + this.getBalance() + "\n";
	output += "Savings Account Interest Rate: " + String.format("%.2f", this.getInterestRate()) + "\n";
	output += "Savings Account Balance in 3 years: $" + String.format("%.2f", this.futureValue(3));
	return output;
    }

}