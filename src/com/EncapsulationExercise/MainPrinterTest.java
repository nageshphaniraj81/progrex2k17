package com.EncapsulationExercise;

/**
 * Created by Nagesh Phaniraj on 1/27/2017.
 */
public class MainPrinterTest {

    public static void main(String [] Args){
        Printer myPrinter = new Printer(false);
        myPrinter.fillToner(100);
        myPrinter.printPaper();
        myPrinter.printPaper();
        for(int i=0;i< 130;i++){
            if(myPrinter.getTonerLevel()<=0){
                System.out.println("Toner level is low , cannot be printed further...");
                break;
            }else {
                myPrinter.printPaper();
            }
        }
    }

}
