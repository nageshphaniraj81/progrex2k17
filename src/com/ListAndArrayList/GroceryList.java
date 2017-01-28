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
        System.out.println("You have : "+groceryList.size()+"Items in your grocery list");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String oldItem,String newItem){
        int position =  findItem(oldItem);
        groceryList.set(position,newItem);
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        groceryList.remove(position);
        System.out.println("Grocery Item"+item+" removed from the position"+(position+1));
    }

    private int findItem(String searchItem){
            return groceryList.indexOf(searchItem);
    }

    public String onFile(String searchItem){
        int position  = groceryList.indexOf(searchItem);
        if(position>=0){
            return groceryList.get(position);
        }
        return null;
    }



}
