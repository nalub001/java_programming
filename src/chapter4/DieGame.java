package chapter4;

import java.util.Random;
import java.util.Scanner;

public class DieGame {

    public static void main(String[] args){

        //initialize known variables
        int totalSpaces = 20;
        int totalRolls=5;

        Random random = new Random();
        int die; int space = 0; int roll=0; int spaceLeft;
        do {
            die = random.nextInt(6)+1;
            space = die+space;
            spaceLeft = totalSpaces - space;
            System.out.println("Roll #"+ (roll+1) +" You've rolled a "+ die +". You are now on space "+ space + " and have "+spaceLeft + " more to go.");
            roll++;
            if(space == totalSpaces){
                System.out.println("You Won!");
                break;
            }
        }while(roll < totalRolls);

        if(space < totalSpaces || space > totalSpaces) {
            System.out.println("You lose!");
        }
    }
}
