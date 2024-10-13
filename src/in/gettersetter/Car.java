package in.gettersetter;

public class Car {
    private String color;//public

    private String model;// public

    private double fuelLevel;

    private long costOfPurchase;//Default



   public Car(double fuelLevel, long costOfPurchase, String model, String color) {
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
        this.model = model;
        this.color = color;
    }
    public String getColor(){
       return color;
    }

    public void setColor(String color){
       this.color = color;
    }
    public String getModel(){
        return model;

    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
