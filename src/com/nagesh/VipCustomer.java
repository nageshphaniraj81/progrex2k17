package com.nagesh;

/**
 * Created by Nagesh Phaniraj on 1/26/2017.
 */
public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Default Name",0.0,"default email address");
        System.out.println("Constructor with no parameters");
    }

    public VipCustomer(String name,double creditLimit){
        this.emailAddress = "defaultValue";
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name,double creditLimit,String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress =emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
