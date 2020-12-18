package chapter9;

public class BirthdayCake  extends Cake{

    private String candles;

    public BirthdayCake(){
        super("Chocolate");
    }

    public String getCandles() {
        return candles;
    }

    public void setCandles(String candles) {
        this.candles = candles;
    }
}
