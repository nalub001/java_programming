package chapter11;

public class Farm {
    public static void main(String[] args){
        Animal pig = new Pig();
        pig.eat();
        pig.makeSound();

        Animal duck = new Duck();
        duck.makeSound();
        duck.eat();

        Pig pig1 = new Pig();
        pig1.eat();
        pig1.makeSound();
    }
}
