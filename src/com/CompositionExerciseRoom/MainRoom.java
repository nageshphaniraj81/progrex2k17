package com.CompositionExerciseRoom;

/**
 * Created by Nagesh Phaniraj on 1/27/2017.
 */
public class MainRoom {

    public static void main(String [] Args) {

        Bed theBed = new Bed(10, 12, 10, "White");
        Bulb theBulb = new Bulb(240, "White", "Italino");
        InkJetPrinter theInkJetPrinter = new InkJetPrinter("Black", "Canon", 1);

        Room myRoom = new Room(theBed, theBulb, theInkJetPrinter);
        myRoom.getBed().vibrateBed();
        myRoom.getBulb().switchOn();
        myRoom.getInkJetPrinter().print();
        myRoom.changeColorofBulb();

    }

}
