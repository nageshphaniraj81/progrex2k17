package com.nagesh;

/**
 * Created by Nagesh Phaniraj on 1/26/2017.
 */
public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Default constructor
    public BankAccount(){
        this(11111,0.0,"default name","default email","default phone number");
        System.out.println("Empty constructor call");

    }

    // Constructor with parameters
    public BankAccount(int accountNumber,double balance,String customerName,String email,String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount){
        balance = balance+depositAmount;
        System.out.println("The amount you have deposited is   :"+depositAmount+" Your Current Balance amount is : "+balance);
    }

    public void withdrawFunds(double withDrawAmount){
        if (withDrawAmount<balance){
            balance = balance-withDrawAmount;
            System.out.println("The amount you are trying to withdraw is :"+withDrawAmount+" Your Balance amount is : "+balance);
        }else{
            System.out.println("Insufficient Balance : You cannot withdraw");
            System.out.println("The amount you have withdrawn is  :"+withDrawAmount+" Your Balance amount is : "+balance);
        }

    }
}
