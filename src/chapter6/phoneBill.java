package chapter6;

public class phoneBill {
    private String id;
    private double baseCost;
    private double allotedMinutes;
    private double minutesUsed;

    public phoneBill() {
    }

    public phoneBill(String id){
        this.id = id;
    }

    public phoneBill(String id, double baseCost, double allotedMinutes, double minutesUsed){
        this.id=id;
        this.baseCost = baseCost;
        this.allotedMinutes = allotedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public void setId(String id){
        this.id = id;
    }
    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }
    public void setAllotedMinutes(int allotedMinutes){
        this.allotedMinutes = allotedMinutes;
    }
    public void setMinutesUsed(int minutesUsed){
        this.minutesUsed = minutesUsed;
    }

    public String getId(){
        return id;
    }
    public double getBaseCost() {
        return baseCost;
    }
    public double getAllotedMinutes() {
        return allotedMinutes;
    }
    public double getMinutesUsed(){
        return minutesUsed;
    }

    public double calculateOverage(double minutes, double charge){
        return minutes * charge;
    }

    public double calculateTax(double basePlanCost, double tax){
        return basePlanCost * tax;
    }

    public void totalPhoneBill(double base, double average, double tax){
        double totalCharge = base+average+tax;
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $"+ String.format("%.2f", base));
        System.out.println("Overage: $"+ String.format("%.2f", average));
        System.out.println("Tax: $"+ String.format("%.2f", tax));
        System.out.println("Total: $"+totalCharge);
    }

}
