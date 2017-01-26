package com.Inheritance;

/**
 * Created by Nagesh Phaniraj on 1/26/2017.
 */
public class Fish extends Animal {
    private  int gills;
    private  int fins;
    private int eyes;

    public Fish(int brain, int body, int weight, String name, int size, int gills, int fins, int eyes) {
        super(1, 1, weight, name, size);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }

    public void rest(){

    }
    public void swim(int speed){
        moveMuscle();
        moveBackFine();
        super.move(speed);
    }

    public void moveMuscle(){

    }

    public void moveBackFine(){

    }
}
