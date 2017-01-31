package com.AutoboxingUnBoxing;

import java.util.ArrayList;

/**
 * Created by Nagesh Phaniraj on 1/31/2017.
 */
public class AutoBoxingandUnBoxing {
    public static void main(String[] args){
        ArrayList <Integer> intArrayList = new ArrayList<Integer>();

        for (int i=0;i<10;i++){
            intArrayList.add(Integer.valueOf(i)); // Autoboxing
            System.out.println("Integer value of i > "+intArrayList.get(i).intValue()); // Unboxing


        }
        Integer myIntValue = 56;
        int intValue = myIntValue;
        System.out.println(intValue);

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        for (double i=0.0;i<10.0;i+=0.5){
            doubleArrayList.add(i); // Autoboxing
        }

        for (int i=0;i<doubleArrayList.size();i++){
            System.out.println("Double value of i > "+doubleArrayList.get(i)); // Unboxing
        }
    }
}
