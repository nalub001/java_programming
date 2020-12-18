package chapter10;

public class Banana extends Fruit{

    @Override
    public void makeJuice(){
        System.out.println("Banana Juice is made");
    }

    private void removePeel(){
        System.out.println("Banana peel removed");
    }
}
