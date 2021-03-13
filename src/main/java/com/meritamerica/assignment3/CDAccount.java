package com.meritamerica.assignment3;

import java.util.Date;

public class CDAccount extends BankAccount {
    // Instance Variables
    private int term;
    private Date startDate;

    // Constructor with parameters
    public CDAccount(CDOffering offering, double balance) {
	super(balance, offering.getInterestRate());
	this.term = offering.getTerm();
	this.startDate = new Date();
    }

    public int getTerm() {
	return this.term;
    }

    public Date getStartDate() {
	return this.startDate;
    }

}
