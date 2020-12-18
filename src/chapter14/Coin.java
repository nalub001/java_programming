package chapter14;

import java.util.Random;

public class Coin {
    private String side;
    public final static String HEADS = "Heads";
    public final static String TAILS = "Tails";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String flip(){
        if(new Random().nextBoolean()){
            setSide(HEADS);
        }else{
            setSide(TAILS);
        }
        return getSide();
    }
}
