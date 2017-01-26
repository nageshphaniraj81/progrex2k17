package com.CompositionExerciseRoom;

/**
 * Created by Nagesh Phaniraj on 1/27/2017.
 */
public class Bulb {

    private int Watage;
    private String Colour;
    private String make;

    public Bulb(int watage, String colour, String make) {
        Watage = watage;
        Colour = colour;
        this.make = make;
    }

    public void switchOn(){
        System.out.println("Bulb is switching on..");
    }

    public int getWatage() {
        return Watage;
    }

    public void setWatage(int watage) {
        Watage = watage;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
