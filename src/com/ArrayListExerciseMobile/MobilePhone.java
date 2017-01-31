package com.ArrayListExerciseMobile;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> contactslist = new ArrayList<Contacts>();

    public void addContacts(String name,String Number){
        contactslist.add(new Contacts(name,Number));
    }

    public void printContacts(){
        System.out.println("You have : "+contactslist.size()+" Contacts in your mobile");
        for(int i=0;i<contactslist.size();i++){
            System.out.println(contactslist.get(i).getContacts());
        }
    }

    public void modifyContacts(String OldName,String newName, String newContact){
        int Position = 0;
        for(int i=0;i<contactslist.size();i++){
            if (new String(contactslist.get(i).getName()).equals(OldName)){
                Position = i;
            }
        }
        contactslist.get(Position).setName(newName);
        contactslist.get(Position).setPhoneNumber(newContact);
    }

    public void removeContacts(String contactName){
        int Position = 0;
        for(int i=0;i<contactslist.size();i++){
            System.out.println("Contact "+i+" is :"+contactslist.get(i).getName());
            System.out.println("Contact to be removed is :"+contactName);
            if (new String(contactslist.get(i).getName()).equals(contactName)){
                Position = i;
                contactslist.remove(Position);
                System.out.println("Contact "+contactName+" removed from the contact list");
            }
        }

    }

    public String findContacts(String searchItem){
        int Position = 0;
        String returnValue = null;
        for(int i=0;i<contactslist.size();i++){
            if (new String(contactslist.get(i).getName()).equals(searchItem)){
                Position = i;
                returnValue = contactslist.get(Position).getContacts();
            }
        }
        return returnValue;
    }

}
