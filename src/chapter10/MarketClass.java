package chapter10;

public class MarketClass {
    public static void main(String[] args){
        Fruit fruit = new Fruit();
        fruit.makeJuice();

        Fruit apple = new Apple();
        System.out.println("Apple Calories: " +apple.getCalories());
        apple.makeJuice();
        ((Apple)apple).removeSeeds();
    }
}
