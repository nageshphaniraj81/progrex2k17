package com.CompositionExerciseRoom;

/**
 * Created by Nagesh Phaniraj on 1/27/2017.
 */
public class Room {

    private Bed bed;
    private Bulb bulb;
    private InkJetPrinter inkJetPrinter;

    public Room(Bed bed, Bulb bulb, InkJetPrinter inkJetPrinter) {
        this.bed = bed;
        this.bulb = bulb;
        this.inkJetPrinter = inkJetPrinter;
    }

    public void changeColorofBulb(){
        bulb.switchOn();
        changeColor();
    }

    private void changeColor(){
        System.out.println("Color is "+bulb.getColour());
        System.out.println("Color is changed to yellow");
    }


    public Bed getBed() {
        return bed;
    }

    public Bulb getBulb() {
        return bulb;
    }

    public InkJetPrinter getInkJetPrinter() {
        return inkJetPrinter;
    }
}
