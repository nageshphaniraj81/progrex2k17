package com.ArrayListExerciseMobile;

import java.util.Scanner;

public class MobileMain {

    private static Scanner scanner =  new Scanner(System.in);
    private static MobilePhone mobilephone = new MobilePhone();

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
                    mobilephone.printContacts();
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
        System.out.println("\t 1 - To print all contacts");
        System.out.println("\t 2 - To add contact to the contact list");
        System.out.println("\t 3 - To modify contact ");
        System.out.println("\t 4 - To remove contact");
        System.out.println("\t 5 - Search contact");
        System.out.println("\t 6 - Exit");
    }

    public static void addItem(){
        System.out.print("Please enter the contact name to be added ");
        String contactName =  scanner.nextLine();
        System.out.print("Please enter the contact number to be added ");
        String contactNumber = scanner.nextLine();
        mobilephone.addContacts(contactName,contactNumber);
    }

    public static void modifyItem(){
        System.out.print("Enter the contact name to be modified");
        String oldContactName = scanner.nextLine();
        System.out.print("Enter the new name ");
        String newContactName = scanner.nextLine();
        System.out.print("Enter the new Number");
        String newContactNumber = scanner.nextLine();
        mobilephone.modifyContacts(oldContactName,newContactName,newContactNumber);
    }

    public static void removeItem(){
        System.out.print("Enter the contact name to be removed");
        String contactName = scanner.nextLine();
        mobilephone.removeContacts(contactName);
    }

    public static void searchForItem(){
        System.out.println("Enter the contact name to be searched for");
        String itemToBeSearched = scanner.nextLine();
        if (mobilephone.findContacts(itemToBeSearched)!=null){
            System.out.println("Contact "+itemToBeSearched+" is found in the directory");
        }else{
            System.out.println("Contact "+itemToBeSearched+"is not found in the directory");
        }
    }

}
