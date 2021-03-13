package com.meritamerica.assignment3;

public class CDOffering {
    // Instance Variables
    private int term;
    private double interestRate;

    // Constructor with parameters
    public CDOffering(int term, double interestRate) {
	this.term = term;
	this.interestRate = interestRate;
    }

    public int getTerm() {
	return this.term;
    }

    public double getInterestRate() {
	return this.interestRate;
    }

}
