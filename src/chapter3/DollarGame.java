package chapter3;

import java.util.Scanner;

public class DollarGame {

    public static void main(String[] arg){
        //initialize known values
        double dollar = 0;

        //Get values for the unknown
        System.out.println("How many pennies would you like");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("How many nickles would you like");
        int nickels = scanner.nextInt();

        System.out.println("How many dimes");
        int dimes = scanner.nextInt();

        System.out.println("How many quarters");
        int quarters = scanner.nextInt();
        scanner.close();

        dollar = quarters*0.25 + dimes*0.10 + nickels*0.05 + pennies*0.01;

        if(dollar == 1){
            System.out.println("You Win!");
        }else if(dollar > 1){
            dollar = dollar-1;
            System.out.println("You went over $1 by: "+dollar);
        }else{
            dollar = 1-dollar;
            System.out.println("You went under $1 by: "+dollar);
        }

        //Get detour

        //output
    }
}
