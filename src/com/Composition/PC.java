package com.Composition;

/**
 * Created by Nagesh Phaniraj on 1/26/2017.
 */
public class PC {
    private Case theCase;
    private MotherBoard motherBoard;
    private Monitor monitor;

    public PC(Case theCase, MotherBoard motherBoard, Monitor monitor) {
        this.theCase = theCase;
        this.motherBoard = motherBoard;
        this.monitor = monitor;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawlogo();
    }

    private void drawlogo(){

        monitor.drawPixelAt(1200,50,"yellow");

    }

//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private MotherBoard getMotherBoard() {
//        return motherBoard;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
}
