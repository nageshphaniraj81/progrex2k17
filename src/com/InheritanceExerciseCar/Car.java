package com.InheritanceExerciseCar;

/**
 * Created by Nagesh Phaniraj on 1/26/2017.
 */
public class Car extends Vehicle {

    private String Model;
    private String Type;

    public Car(String color, int doors, String model, String type) {
        super(4, color, doors);
        Model = model;
        Type = type;
    }

    @Override
    public void moveSteering(String steering) {
        super.moveSteering(steering);
        System.out.println("Move car Steering");
    }

    @Override
    public void changeGears(int gears) {
        super.changeGears(gears);
        System.out.println("Change car gears");
    }

    @Override
    public void move(int speed) {
        super.move(speed);
        System.out.println("Change car speed");
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}
