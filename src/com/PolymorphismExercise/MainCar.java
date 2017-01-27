package com.PolymorphismExercise;


 class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int doors;


     private String name;


    public Car(int cylinders,String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = 5;
        this.name = name;
    }

     public void startEngine(){
         System.out.println("Engine Started");
     }

     public void accelerate(){
         System.out.println("Accelerated");
     }

     public void applyBreak(){
         System.out.println("Car Stopped");
     }

     public boolean isEngine() {
         return engine;
     }

     public int getCylinders() {
         return cylinders;
     }

     public int getWheels() {
         return wheels;
     }

     public int getDoors() {
         return doors;
     }

     public String getName() {
         return name;
     }

 }

 class ToyotaCarolla extends Car{

     public ToyotaCarolla() {
         super(4, "Toyota Carolla");
     }

     @Override
     public void startEngine() {
         System.out.println("Start Corolla");
     }

     @Override
     public void accelerate() {
         System.out.println("Accelerate Corolla");
     }

     @Override
     public void applyBreak() {
         System.out.println("Apply break to Corolla");
     }
 }

 class Hyundaii10 extends Car{
     public Hyundaii10() {
         super(4, "Hyundai i10");
     }

     @Override
     public void startEngine() {
         System.out.println("Start i10");
     }
 }

 class OutLander extends Car{
     public OutLander() {
         super(6, "Outlander");
     }

     @Override
     public void applyBreak() {
         System.out.println("Stop Outlander");
     }
 }



public class MainCar {
    public static void main(String [] args){

        Car myCar = new Hyundaii10();
        myCar.startEngine();
        myCar.accelerate();
        myCar.applyBreak();

        Car myCar1 = new OutLander();
        myCar1.startEngine();
        myCar1.accelerate();
        myCar1.applyBreak();

        Car myCar3 = new ToyotaCarolla();
        myCar3.startEngine();
        myCar3.accelerate();
        myCar3.applyBreak();
    }
}
