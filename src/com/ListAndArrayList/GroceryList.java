package com.ListAndArrayList;

import java.util.ArrayList;

/**
 * Created by Nagesh Phaniraj on 1/28/2017.
 */
public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printArrayList(){
        System.out.println("You have "+groceryList.size()+"Items in your grocery list");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }

    public  void modifyGroceryItem(int position,String newItem){
        groceryList.set(position, newItem);
    }

}
