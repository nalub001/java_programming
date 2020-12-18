package chapter7;

import java.util.Scanner;

public class dayOfTheWeek {

    public static String[] weekdays = {"Monday", "Tuesday", "Wednesday","Thursday", "Friday","Saturday", "Sunday"};
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter a number for the day of the week");
        int day = scanner.nextInt();
        String weekday = getday(day);
        System.out.println("Corresponding day: " + weekday + " "+ weekdays[day - 1]);


        scanner.close();
    }

    public static String getday(int day){
        String weekday = null;

        if (day == 1){
            weekday = weekdays[0];
        } else if(day == 2){
            weekday = weekdays[1];
        }else if(day == 3){
            weekday = weekdays[2];
        }else if (day == 4){
            weekday = weekdays[3];
        }else if(day == 5){
            weekday = weekdays[4];
        }else if(day == 6) {
            weekday = weekdays[5];
        }else if(day == 7) {
            weekday = weekdays[7];
        }else {
            System.out.print("Number out of Range, Please Enter a number between 1 and 7");
            weekday = null;
        }

        return weekday;
    }
}
