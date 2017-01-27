package com.BillsBurgerExerciseCorrected;

/**
 * Created by Nagesh Phaniraj on 1/27/2017.
 */
public class Hamburger {

    private String name;
    private String meat;
    private double price;
    private String breadroll;

    public Hamburger(String name, String meat, double price, String breadroll) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadroll = breadroll;
    }

    private String additionalItem1Name;
    private double additionalItem1Price;

    private String additionalItem2Name;
    private double additionalItem2Price;

    private String additionalItem3Name;
    private double additionalItem3Price;

    private String additionalItem4Name;
    private double additionalItem4Price;

    public void addAdditionalItem1(String name,Double price){
        this.additionalItem1Name = name;
        this.additionalItem1Price = price;
    }

    public void addAdditionalItem2(String name,Double price){
        this.additionalItem2Name = name;
        this.additionalItem2Price = price;
    }
    public void addAdditionalItem3(String name,Double price){
        this.additionalItem3Name = name;
        this.additionalItem3Price = price;
    }
    public void addAdditionalItem4(String name,Double price){
        this.additionalItem4Name = name;
        this.additionalItem4Price = price;
    }

    public Double itemisedBurger(){
        double baseBurgerPrice = this.price;
        System.out.println("Burger with "+this.getName()+" bread roll :"+this.breadroll+" Price is :"+this.price);

        if(additionalItem1Name!=null){
            baseBurgerPrice = baseBurgerPrice+this.additionalItem1Price;
            System.out.println("Extra "+additionalItem1Name+ " added with an additional price of "+additionalItem1Price);
        }

        if(additionalItem2Name!=null){
            baseBurgerPrice = baseBurgerPrice+this.additionalItem2Price;
            System.out.println("Extra "+additionalItem2Name+ " added with an additional price of "+additionalItem2Price);
        }

        if(additionalItem3Name!=null){
            baseBurgerPrice = baseBurgerPrice+this.additionalItem3Price;
            System.out.println("Extra "+additionalItem3Name+ " added with an additional price of "+additionalItem3Price);
        }

        if(additionalItem4Name!=null){
            baseBurgerPrice = baseBurgerPrice+this.additionalItem4Price;
            System.out.println("Extra "+additionalItem1Name+ " added with an additional price of "+additionalItem4Price);
        }

        return baseBurgerPrice;
    }





    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadroll() {
        return breadroll;
    }
}
