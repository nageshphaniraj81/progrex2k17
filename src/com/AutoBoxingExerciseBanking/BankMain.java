package com.AutoBoxingExerciseBanking;

/**
 * Created by Nagesh Phaniraj on 1/31/2017.
 */
public class BankMain {
    public static void main(String [] args){
        Bank bank = new Bank("State Bank of India");
        bank.addBranch("Belandur");
        bank.addCustomer("Belandur","Nagesh",99.90);
        bank.addCustomer("Belandur","Anusha",300.50);
        bank.addBranch("Jayanagar");
        bank.addCustomer("Jayanagar","Santosh",50.80);

        bank.addCustomerTransaction("Belandur","Nagesh",44.00);
        bank.addCustomerTransaction("Belandur","Nagesh",999.00);
        bank.addCustomerTransaction("Belandur","Anusha",50.00);
        bank.listCustomer("Belandur",true);
        bank.listCustomer("Jayanagar",true);
    }
}
