package com.InheritanceExerciseCar;

/**
 * Created by Nagesh Phaniraj on 1/26/2017.
 */
public class Vehicle {

    private int wheels;
    private String color;
    private int doors;

    public Vehicle(int wheels, String color, int doors) {
        this.wheels = wheels;
        this.color = color;
        this.doors = doors;
    }

    public void moveSteering(String steering){
        System.out.println("Vehicle Steering movement towards :"+steering);
    }

    public void changeGears(int gears){
        System.out.println("Vehicle Gear changed to :"+gears);
    }

    public void move(int speed){
        System.out.println("Vehicle is moving at a speed of : "+speed);
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}
