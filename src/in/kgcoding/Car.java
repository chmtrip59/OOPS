package in.kgcoding;

public class Car   {
    //This is public class

    public String color;

    public String model;

    private double fuelLevel;

    long costOfPurchase;//Default access modifier

    public Car(){
        //This is constructor
    }


    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", costOfPurchase=" + costOfPurchase +
                '}';
    }
}
