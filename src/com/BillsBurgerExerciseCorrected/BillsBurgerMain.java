package com.BillsBurgerExerciseCorrected;

/**
 * Created by Nagesh Phaniraj on 1/27/2017.
 */
public class BillsBurgerMain {
    public static void main(String [] args){
        Hamburger hamburger = new Hamburger("Normal Burger","double meat",3.50,"Brown");
        hamburger.addAdditionalItem1("lettuce",3.12);
        hamburger.addAdditionalItem2("Olives",4.20);
        System.out.println("Total Price of the burger is : "+hamburger.itemisedBurger());

        System.out.println("\n");
        HealthyBurger healthyBurger = new HealthyBurger("Saloman",6.0);
        healthyBurger.addAdditionalItem1("carrot",3.0);
        healthyBurger.addHealthyAdditionalItem1("egg",2.5);
        System.out.println("Total Price of the burger is : "+healthyBurger.itemisedBurger());

        System.out.println("\n");
        DeluxeBurger db = new DeluxeBurger();
        System.out.println("Total Price of the burger is : "+db.itemisedBurger());
    }
}
