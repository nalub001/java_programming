package chapter9;

public class WeddingCake extends Cake{
    private String tiers;

    public WeddingCake(){
        super("Raspberry");
    }

    public String getTiers() {
        return tiers;
    }

    public void setTiers(String tiers) {
        this.tiers = tiers;
    }
}
