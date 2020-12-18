package chapter9;

public class TasteTester {

    public static void main(String[] args){
        Cake cake = new Cake("StrawBerry");
        cake.setPrice(29.99);
        System.out.println("Cake Flavor is: " + cake.getFlavor());
        System.out.println("Cake Price is: " + cake.getPrice());

        WeddingCake weddingCake= new WeddingCake();
        weddingCake.setPrice(49.99);
        System.out.println("Wedding Cake Flavor is: " + weddingCake.getFlavor());
        System.out.println("Wedding Cake Price is: " + weddingCake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(69.99);
        System.out.println("Birthday Cake Flavor is: " + birthdayCake.getFlavor());
        System.out.println("Birthday Cake Price is: " + birthdayCake.getPrice());

    }
}
