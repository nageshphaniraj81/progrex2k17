package com.InheritanceExerciseCar;

/**
 * Created by Nagesh Phaniraj on 1/26/2017.
 */
public class MainClassCar {
    public static void main(String [] Args){
        Jaguar myCar = new Jaguar("Red",2,"2017","Sadan",2);
        myCar.welcomeMessage();
        myCar.changeGears(5);
        myCar.move(500);
        myCar.setLuxuryClass(4);
        myCar.welcomeMessage();
        myCar.moveSteering("left");
    }
}
