package com.Composition;

/**
 * Created by Nagesh Phaniraj on 1/26/2017.
 */
public class MainComposition {
    public static void main(String [] Args) {
        Dimensions dimentions = new Dimensions(20, 20, 5);
        Case theCase = new Case("1234", "Dell", "240", dimentions);
        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        MotherBoard motherboard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, motherboard, monitor);
//        thePC.getMonitor().drawPixelAt(1500,1200,"Red");
//        thePC.getMotherBoard().loadProgram("Windows 10");
//        thePC.getTheCase().pressPowerButton();

        thePC.powerUp();


    }
}
