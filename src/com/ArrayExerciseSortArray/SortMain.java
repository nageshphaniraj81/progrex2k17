package com.ArrayExerciseSortArray;
import java.util.Arrays;
import java.util.Scanner;
public class SortMain {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){
        int [] array1 = getIntegers(6);
        printArray(array1);
        System.out.println("Sorted Array is : \n");
        printArray(sortIntegers(array1));
    }

    public static int[] getIntegers(int number){
        int [] values = new int[number];
        System.out.println("Enter "+number+" values \r");
        for(int i=0;i<values.length;i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int []  array){
        for(int i=0;i<array.length;i++){
            System.out.println("Array Element at position "+i+" is :"+array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int [] sortedArray = new int[array.length];
        Arrays.sort(array);
        sortedArray = array;
        return sortedArray;

    }


}
