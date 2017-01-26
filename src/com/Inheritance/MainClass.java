package com.Inheritance;

/**
 * Created by Nagesh Phaniraj on 1/26/2017.
 */
public class MainClass {

    public static void main(String[] Args){
        Animal animal  =  new Animal(1,1,1,"Animal",10);
        Dog dog = new Dog(20,"Pinky",8,2,2,20,2,"nice coat");
        dog.eat();
        dog.walk();
        dog.run();

    }

}
