package com.nagesh;

public class Main {

    public static void main(String[] args) {
	   // To print love programming
        System.out.println("Love Programming");

//        Car porsche = new Car();
//        Car holden = new Car();
//        porsche.setModel("Carrera");
//        porsche.getModel();
//        System.out.println("Model is :"+porsche.getModel());


        // Test Bank Account

//        BankAccount nageshAccount = new BankAccount();
//
////        nageshAccount.setCustomerName("Nagesh");
////        nageshAccount.setAccountNumber(12345);
////        nageshAccount.setBalance(1000);
////        nageshAccount.setEmail("nageshphaniraj@gmail.com");
////        nageshAccount.setPhoneNumber("9886292980");
//
//        nageshAccount.depositFunds(9800);
//        nageshAccount.withdrawFunds(10000);
//        nageshAccount.withdrawFunds(5000);

        // Test VipCustomer Class

        VipCustomer nagesh = new VipCustomer("Nagesh",10000,"nageshphaniraj@gmail.com");
        System.out.println("Customer Name :"+nagesh.getName()+" | Credit Limit : "+nagesh.getCreditLimit()+" | email : "
        +nagesh.getEmailAddress());

        VipCustomer anusha = new VipCustomer("Anusha",20000);
        System.out.println("Customer Name :"+anusha.getName()+" | Credit Limit : "+anusha.getCreditLimit()+" | email : "
                +anusha.getEmailAddress());


    }
}
