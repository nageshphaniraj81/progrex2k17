package com.InheritanceExerciseCar;

/**
 * Created by Nagesh Phaniraj on 1/26/2017.
 */
public class Jaguar extends Car {

    private int luxuryClass;

    public Jaguar(String color, int doors, String model, String type, int luxuryClass) {
        super(color, doors, model, type);
        this.luxuryClass = luxuryClass;
    }

    public int getLuxuryClass() {
        return luxuryClass;
    }

    public void setLuxuryClass(int luxuryClass) {
        this.luxuryClass = luxuryClass;
    }

    public void welcomeMessage(){
        if(luxuryClass<=2){
            System.out.println("Welcome to the new world of luxury, enjoy the pride");

        }else{
            System.out.println("Jaguar welcomes you to its family, enjoy the ride");
        }
        System.out.println("Your car details below :");
        System.out.println("Color :" +this.getColor());
        System.out.println("Doors :"+this.getDoors());
        System.out.println("Model Type:"+this.getModel());
        System.out.println("Luxury class :"+this.getLuxuryClass());

    }
}
