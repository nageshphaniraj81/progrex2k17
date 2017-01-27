package com.BillsBurgerExerciseCorrected;

/**
 * Created by Nagesh Phaniraj on 1/27/2017.
 */
public class HealthyBurger extends Hamburger {
    public HealthyBurger(String meat, double price) {
        super("Healthy Burger", meat, price, "Brown rey");
    }

    private String healthyAdditionalItem1Name;
    private double healthyadditionalItem1Price;

    private String healthyAdditionalItem2Name;
    private double healthyAdditionalItem2Price;

    public void addHealthyAdditionalItem1(String name,Double price){
        this.healthyAdditionalItem1Name = name;
        this.healthyadditionalItem1Price = price;
    }

    public void addHealthyAdditionalItem2(String name,Double price){
        this.healthyAdditionalItem2Name = name;
        this.healthyAdditionalItem2Price = price;
    }

    @Override
    public Double itemisedBurger() {
        double healthBurgerPrice =  super.itemisedBurger();
      //  System.out.println("Burger with "+this.getName()+" bread roll :"+this.getBreadroll()+" Price is :"+this.getPrice());

        if(healthyAdditionalItem1Name!=null){
            healthBurgerPrice = healthBurgerPrice+this.healthyadditionalItem1Price;
            System.out.println("Extra "+healthyAdditionalItem1Name+ " added with an additional price of "+healthyadditionalItem1Price);
        }

        if(healthyAdditionalItem2Name!=null){
            healthBurgerPrice = healthBurgerPrice+this.healthyAdditionalItem2Price;
            System.out.println("Extra "+healthyAdditionalItem2Name+ " added with an additional price of "+healthyAdditionalItem2Price);
        }
        return healthBurgerPrice;
    }
}
