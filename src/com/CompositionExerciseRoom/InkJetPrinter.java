package com.CompositionExerciseRoom;

/**
 * Created by Nagesh Phaniraj on 1/27/2017.
 */
public class InkJetPrinter {

    private String color;
    private String manufacturer;
    private int papertrays;

    public InkJetPrinter(String color, String manufacturer, int papertrays) {
        this.color = color;
        this.manufacturer = manufacturer;
        this.papertrays = papertrays;
    }

    public void print(){
        System.out.println("Printing on paper A4");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPapertrays() {
        return papertrays;
    }

    public void setPapertrays(int papertrays) {
        this.papertrays = papertrays;
    }
}
