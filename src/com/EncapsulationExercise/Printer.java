package com.EncapsulationExercise;

/**
 * Created by Nagesh Phaniraj on 1/27/2017.
 */
public class Printer {

    private int tonerLevel=0;
    private int numberOfPagesPrinted=0;
    private boolean isDuplex;

    public Printer(boolean isDuplex) {
        this.isDuplex = isDuplex;
    }

    public void fillToner(int tonerFillLevel){
        if(tonerFillLevel>100 || (tonerLevel+tonerFillLevel > 100)){
            System.out.println("Toner cannot be filled, as it will over load toner tray");
        }else{
            tonerLevel+=tonerFillLevel;
            System.out.println("Toner level is : "+tonerLevel);
        }
    }

    public void printPaper(){

        if (tonerLevel<=0){
            System.out.println("Toner level is low, please fill the toner to proceed");
        }else {
            if (isDuplex) {
                numberOfPagesPrinted = numberOfPagesPrinted + 2;
                tonerLevel = tonerLevel-2;
            } else {
                numberOfPagesPrinted++;
                tonerLevel--;
            }
        }

        System.out.println("Total number of pages printed : "+numberOfPagesPrinted);
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
