package com.meritamerica.assignment3;

public class AccountHolder {
    // Instance variables
    private String firstName;
    private String middleName;
    private String lastName;
    private String ssn;
    private CheckingAccount[] checkingAccounts = new CheckingAccount[0];
    private SavingsAccount[] savingsAccounts = new SavingsAccount[0];
    private CDAccount[] cdAccounts = new CDAccount[0];

    // Constructor with parameters
    public AccountHolder(String firstName, String middleName, String lastName, String ssn) {

	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.ssn = ssn;
    }

    // Setters and Getters methods for each instance variable
    public String getFirstName() {
	return this.firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getMiddleName() {
	return this.middleName;
    }

    public void setMiddleName(String middleName) {
	this.middleName = middleName;
    }

    public String getLastName() {
	return this.lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getSSN() {
	return this.ssn;
    }

    public void setSSN(String ssn) {
	this.ssn = ssn;
    }

    public CheckingAccount addCheckingAccount(double openingBalance) {
	CheckingAccount checkingAccount = new CheckingAccount(openingBalance);
	return this.addCheckingAccount(checkingAccount);
    }

    public CheckingAccount addCheckingAccount(CheckingAccount checkingAccount) {
	if (this.getCombinedBalance() > 250000) {
	    return null;
	}

	CheckingAccount[] newCheckingAccounts = new CheckingAccount[this.checkingAccounts.length + 1];
	for (int i = 0; i < this.checkingAccounts.length; i++) {
	    newCheckingAccounts[i] = this.checkingAccounts[i];
	}
	newCheckingAccounts[this.checkingAccounts.length] = checkingAccount;
	this.checkingAccounts = newCheckingAccounts;

	return checkingAccount;
    }

    public CheckingAccount[] getCheckingAccounts() {
	return this.checkingAccounts;
    }

    public int getNumberOfCheckingAccounts() {
	return this.checkingAccounts.length;
    }

    public double getCheckingBalance() {
	double checkingBalance = 0;
	for (int i = 0; i < this.checkingAccounts.length; i++) {
	    checkingBalance += this.checkingAccounts[i].getBalance();
	}

	return checkingBalance;
    }

    public SavingsAccount addSavingsAccount(double openingBalance) {
	SavingsAccount savingsAccount = new SavingsAccount(openingBalance);
	return this.addSavingsAccount(savingsAccount);
    }

    public SavingsAccount addSavingsAccount(SavingsAccount savingsAccount) {
	if (this.getCombinedBalance() > 250000) {
	    return null;
	}

	SavingsAccount[] newSavingsAccounts = new SavingsAccount[this.savingsAccounts.length + 1];
	for (int i = 0; i < this.savingsAccounts.length; i++) {
	    newSavingsAccounts[i] = this.savingsAccounts[i];
	}
	newSavingsAccounts[this.savingsAccounts.length] = savingsAccount;
	this.savingsAccounts = newSavingsAccounts;

	return savingsAccount;
    }

    public SavingsAccount[] getSavingsAccounts() {
	return this.savingsAccounts;
    }

    public int getNumberOfSavingsAccounts() {
	return this.savingsAccounts.length;
    }

    public double getSavingsBalance() {
	double savingsBalance = 0;
	for (int i = 0; i < this.savingsAccounts.length; i++) {
	    savingsBalance += this.savingsAccounts[i].getBalance();
	}

	return savingsBalance;
    }

    public CDAccount addCDAccount(CDOffering offering, double openingBalance) {
	if (offering == null)
	    return null;

	CDAccount cdAccount = new CDAccount(offering, openingBalance);
	return this.addCDAccount(cdAccount);
    }

    public CDAccount addCDAccount(CDAccount cdAccount) {
	CDAccount[] newCDAccounts = new CDAccount[this.cdAccounts.length + 1];
	for (int i = 0; i < this.cdAccounts.length; i++) {
	    newCDAccounts[i] = this.cdAccounts[i];
	}
	newCDAccounts[this.cdAccounts.length] = cdAccount;
	this.cdAccounts = newCDAccounts;

	return cdAccount;
    }

    public CDAccount[] getCDAccounts() {
	return this.cdAccounts;
    }

    public int getNumberOfCDAccounts() {
	return this.cdAccounts.length;
    }

    public double getCDBalance() {
	double cdBalance = 0;
	for (int i = 0; i < this.cdAccounts.length; i++) {
	    cdBalance += this.cdAccounts[i].getBalance();
	}

	return cdBalance;
    }

    public double getCombinedBalance() {
	return this.getCheckingBalance() + this.getSavingsBalance() + this.getCDBalance();
    }

    public String toString() {
	String output = "Name: " + this.getFirstName() + " " + this.getMiddleName() + " " + this.getLastName() + "\n";
	output += "SSN: " + this.getSSN() + "\n";
	output += this.getCheckingAccounts().toString() + "\n";
	output += this.getSavingsAccounts().toString();
	return output;

    }
}