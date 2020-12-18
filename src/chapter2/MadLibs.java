package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String arg[]){

        //1. Ask user for a season of the year
        System.out.println("Enter a season of the year");
        Scanner scanner = new Scanner(System.in);
        String SeasonOfTheYear = scanner.next();

        //2. Ask user for whole number
        System.out.println("Enter a whole number");
        int wholeNumber = scanner.nextInt();

        //3. Ask user for an adjective
        System.out.println("Enter an Adjective");
        String Adjective = scanner.next();

        System.out.println("On a "+Adjective+ " "+ SeasonOfTheYear + " day, I drink a minimum of "+wholeNumber + " cups of coffee");
        scanner.close();
    }
}
