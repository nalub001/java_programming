package chapter6;

import java.util.Scanner;

public class phoneBillTest {

    static double tax = 0.15;
    static double charge = 0.25;
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ID");
        String id = scanner.next();
        System.out.println("Enter base pay");
        double base = scanner.nextDouble();
        System.out.println("Enter average Allocated minutes");
        double allocatedMinutes = scanner.nextDouble();
        System.out.println("Enter average used minutes");
        double usedMinutes = scanner.nextDouble();


        phoneBill pb = new phoneBill(id, base, allocatedMinutes, usedMinutes);
        double overage = pb.calculateOverage(usedMinutes, charge);
        double taxpay = pb.calculateTax(base, tax);

        pb.totalPhoneBill(base, overage, taxpay);

        scanner.close();
    }
}
