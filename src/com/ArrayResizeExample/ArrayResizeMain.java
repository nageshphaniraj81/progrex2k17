package com.ArrayResizeExample;


import java.util.Scanner;

public class ArrayResizeMain {

    private static int[] baseData = new int[10];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter 10 Integer");
        getArrayInput();
        System.out.println("Array before resize is : ");
        printArray(baseData);
        resizeArray();
        baseData[10] = 50;
        baseData[11] = 60;
        System.out.println("Array After resize is :");
        printArray(baseData);

    }

    public static void  getArrayInput() {


        for(int i=0;i<baseData.length;i++){
            baseData[i] = scanner.nextInt();
        }

    }

    public static void printArray(int[] arrayToPrint) {

        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println(arrayToPrint[i] + " ");
        }
    }

       public static void resizeArray(){

           int [] original =  baseData;

           baseData = new int[12];
           for(int i=0;i<original.length;i++){
               baseData[i] = original[i];
           }

    }

}
