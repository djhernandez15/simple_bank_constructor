package com.davidhernandez;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    public Account() {
        this("Default", 0.0, "Default", "default@default.com", "888-888-8888");
        System.out.println("Empty constructor called");
    }

    public Account(String accountNumber, double balance, String customerName, String customerEmail, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Depositing $" + depositAmount);
        System.out.println("Balance after deposit: $" + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (withdrawalAmount > this.balance) {
            System.out.println("Insufficient funds to process transaction. Available balance: $" + this.balance);
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawing $" + withdrawalAmount);
            System.out.println("Balance after withdraw: $" + this.balance);
        }
    }



}
