package com.Composition;

/**
 * Created by Nagesh Phaniraj on 1/26/2017.
 */
public class Case {
    private String model;
    private String manufacturer;
    private  String powersupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powersupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powersupply = powersupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton(){
        System.out.println("Power Button is pressed");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPowersupply() {
        return powersupply;
    }

    public void setPowersupply(String powersupply) {
        this.powersupply = powersupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
}
