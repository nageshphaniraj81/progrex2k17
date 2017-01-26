package com.CompositionExerciseRoom;

/**
 * Created by Nagesh Phaniraj on 1/27/2017.
 */
public class Bed {

    private int length;
    private int width;
    private int thickness;
    private String Colour;

    public Bed(int length, int width, int thickness, String colour) {
        this.length = length;
        this.width = width;
        this.thickness = thickness;
        Colour = colour;
    }

    public void vibrateBed(){
        System.out.println("Bed is vibrating with a resonance of 30");
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getThickness() {
        return thickness;
    }

    public String getColour() {
        return Colour;
    }
}
