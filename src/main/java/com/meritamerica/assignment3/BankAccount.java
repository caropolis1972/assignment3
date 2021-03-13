package com.meritamerica.assignment3;

public class BankAccount {
    // Instance variables
    private long accountNumber;
    private double balance;
    private double interestRate;

    // Constructor w/ 2 parameters
    public BankAccount(double balance, double interestRate) {
	this(MeritBank.getNextAccountNumber(), balance, interestRate);
    }

    // Constructor w/3 parameters
    public BankAccount(long accountNumber, double balance, double interestRate) {
	this.accountNumber = accountNumber;
	this.balance = balance;
	this.interestRate = interestRate;
    }

    public long getAccountNumber() {
	return this.accountNumber;
    }

    public double getBalance() {
	return this.balance;
    }

    public double getInterestRate() {
	return this.interestRate;
    }

    public boolean withdraw(double amount) {
	if (amount >= 0 && amount <= this.balance) {
	    this.balance -= amount;
	    return true;
	}
	// Withdraw amount was negative or greater than balance
	return false;
    }

    public boolean deposit(double amount) {
	if (amount >= 0) {
	    this.balance += amount;
	    return true;
	}
	// Deposit amount was negative
	return false;
    }

    public double futureValue(int years) {
	return (this.balance * (Math.pow(1 + this.getInterestRate(), years)));
    }
}
