package com.nagesh;

/**
 * Created by Nagesh Phaniraj on 1/24/2017.
 */
public class WhileStatement {
    public static void main(String[] Args){

        int Number = 5;
        int endNumber = 167;
        int countEvenNumber = 0;

        while (Number<=endNumber){

            if(countEvenNumber==5){
                break;
            }

            if(!isEvenNumber(Number)){
                Number++;
                continue;
            }
            System.out.println("Even number is :"+Number);
            Number++;
            countEvenNumber++;
        }



        boolean result = isEvenNumber(17863);
        System.out.println("Result of odd even is "+result);

        int count =0;
        while (count != 5){
            System.out.println("Count value is :"+count);
            count++;
        }

        count =1;
        while (true){
            if(count == 6){
                break;
            }
            System.out.println("count value is :"+count);
            count++;
        }
        count =1;
        do{
            System.out.println("count value is :"+count);
            count++;
        }while(count !=6);
    }

    public static boolean isEvenNumber(int number){

        if (number%2 == 0)
            return true;
        else
            return false;

    }
}
