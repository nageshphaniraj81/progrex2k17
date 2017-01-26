package com.Inheritance;

/**
 * Created by Nagesh Phaniraj on 1/26/2017.
 */
public class Animal {
    private int brain;
    private int body;
    private int weight;
    private String name;
    private int size;

    public Animal(int brain, int body, int weight, String name, int size) {
        this.brain = brain;
        this.body = body;
        this.weight = weight;
        this.name = name;
        this.size = size;
    }

    public void eat(){
        System.out.println("Animal.eat called");
    }

    public  void move(int speed){
        System.out.println("Animal.move called");
        System.out.println("Animal was moving at speed : "+speed);

    }
    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
