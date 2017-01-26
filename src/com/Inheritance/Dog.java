package com.Inheritance;

/**
 * Created by Nagesh Phaniraj on 1/26/2017.
 */
public class Dog extends Animal {

    private int eyes;
    private  int legs;
    private  int tail;
    private int teeth;
    private String coat;

    public Dog( int weight, String name, int size,int eyes,int legs,int tail,int teeth,String coat) {
        super(1, 1, weight, name, size);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat=coat;
    }

    private void chew(){
        System.out.println("Dog.chew called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat called");
        chew();
        super.eat();
    }

    public void walk(){
        super.move(5);
    }

    public  void run(){
        move(10);
    }

    public void moveLegs(int Speed){
        System.out.println("Legs speed is :"+Speed);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
