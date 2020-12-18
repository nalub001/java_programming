package chapter10;

public class Fruit {
    private int calories;

    public void makeJuice(){
        System.out.println("Juice is made");
    }

    public void setCalories(int calories){
        this.calories = calories;
    }

    public int getCalories(){
        return calories;
    }
}
