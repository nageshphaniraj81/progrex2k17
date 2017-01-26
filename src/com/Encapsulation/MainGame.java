package com.Encapsulation;

/**
 * Created by Nagesh Phaniraj on 1/27/2017.
 */
public class MainGame {

    public static void main(String[] Args){
//        Player player =  new Player();
//        player.name = "Nagesh";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 11;
//        player.looseHealth(damage);
//        System.out.println("Remaining Health is :"+player.healthRemaining());
//
//        damage = 14;
//        player.health = 200;
//        player.looseHealth(damage);
//        System.out.println("Remaining Health is :"+player.healthRemaining());

        EnhancedPlayer eplayer = new EnhancedPlayer("Nagesh",50,"Sword");
        System.out.println("Initial Health is :"+eplayer.getHealth());
        eplayer.looseHealth(40);
        System.out.println("Current Health is :"+eplayer.getHealth());
    }

}
