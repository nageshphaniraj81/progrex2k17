package com.BillsBurgerExerciseCorrected;

/**
 * Created by Nagesh Phaniraj on 1/27/2017.
 */
public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Saloman", 9.5, "White");
        super.addAdditionalItem1("Chips",3.0);
        super.addAdditionalItem2("Drinks",2.0);
    }


    @Override
    public void addAdditionalItem1(String name, Double price) {
        System.out.println("This item cannot be added as it is Deluxe Burger");
    }

    @Override
    public void addAdditionalItem2(String name, Double price) {
        System.out.println("This item cannot be added as it is Deluxe Burger");
    }

    @Override
    public void addAdditionalItem3(String name, Double price) {
        System.out.println("This item cannot be added as it is Deluxe Burger");
    }

    @Override
    public void addAdditionalItem4(String name, Double price) {
        System.out.println("This item cannot be added as it is Deluxe Burger");
    }
}
