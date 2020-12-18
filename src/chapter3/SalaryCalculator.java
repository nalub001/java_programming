package chapter3;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] arg){

        //initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //quick detour for the bonus
        if(sales > quota){
            salary = salary+bonus;
        }

        //output
        System.out.println("Employee pay is $"+salary);
    }
}
