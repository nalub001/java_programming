package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    static double tax = 0.15;
    static double charge = 0.25;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base cost of the plan");
        double basepay = scanner.nextDouble();
        System.out.println("Enter average minutes");
        double minutes = scanner.nextDouble();

        double average = calculateAverage(minutes);
        double taxPay = calculateTax(basepay);

        double total = total(basepay, average, taxPay);
        scanner.close();

    }

    private static double calculateTax(double basePlanCost){
        double taxPay =basePlanCost * tax;
        return taxPay;
    }

    private static double calculateAverage(double minutes){
        double average =minutes * charge;
        return average;
    }

    private static double total(double basepay, double average, double taxPay){
        double totalCharge = basepay+average+taxPay;
        System.out.println("Final total is $"+totalCharge);
        return totalCharge;
    }
}
