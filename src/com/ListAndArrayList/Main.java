package com.ListAndArrayList;

import java.util.Scanner;

/**
 * Created by Nagesh Phaniraj on 1/28/2017.
 */
public class Main {

    private static Scanner scanner =  new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String []  args){

        boolean quit = false;
        int choice =0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0 :
                    printInstructions();
                    break;
                case 1 :
                    groceryList.printArrayList();
                    break;
                case 2 :
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }

        }

    }

    public static void printInstructions(){
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print choice option");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - Search for an item in the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addItem(){
        System.out.print("Please enter the item to be added ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter the item  to be modified");
        String oldItem = scanner.nextLine();
        System.out.println("Enter the replacement item : ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(oldItem,newItem);
    }

    public static void removeItem(){
        System.out.print("Enter the item number to be removed");
        groceryList.removeGroceryItem(scanner.nextLine());
    }

    public static void searchForItem(){
        System.out.println("Enter the item to be searched for");
        String itemToBeSearched = scanner.nextLine();
        if (groceryList.onFile(itemToBeSearched)!=null){
            System.out.println("Item "+itemToBeSearched+" is found in the grocery list");
        }else{
            System.out.println("Item "+itemToBeSearched+"is not found in the grocery list");
        }
    }
}
