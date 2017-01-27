package com.Array;

/**
 * Created by Nagesh Phaniraj on 1/27/2017.
 */
public class Main {
    public  static void main(String [] args){
        int [] myIntArray = new int[10];
        myIntArray[5] = 50;
        double [] myDoubleArray = new double[10];
        myDoubleArray[2] = 26.4;
        System.out.println(myDoubleArray[2]);

        int [] myInArray2 = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(myInArray2[2]);
        System.out.println(myInArray2[3]);
        System.out.println(myInArray2[4]);

        int [] myIntArray3 = new int[250];
        printArray(myIntArray3);



    }

    public static void printArray(int [] array){
        for (int i=0;i<array.length;i++){
            array[i]= i*10;
            System.out.println("Array value of myIntArry Elememt : "+i+" is :"+array[i]);
        }
    }


}
