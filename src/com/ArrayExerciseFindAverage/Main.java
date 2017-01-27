package com.ArrayExerciseFindAverage;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int[] arrayValues = getArray(5);
        for(int i=0;i<args.length;i++){
            System.out.println("Printed Number for the position "+i+" is :"+arrayValues[i]);
        }
        System.out.println("Average value of the array is "+getAverage(arrayValues));


    }

    public static int[] getArray(int number){
        int [] values = new int[number];
        System.out.println("Enter "+number+" values \r");
        for(int i=0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int [] array){
        double sum = 0;
        for(int i=0;i<array.length;i++){
            sum = sum+array[i];
        }
        double average =  (double) sum / (double)array.length;
        return average;
    }
}
