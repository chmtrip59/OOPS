package in.kgcoding.abstraction;

public class Car extends Vehicle{


    private int noOdDoors;

    public Car() {
        super(4);
    }


    @Override
    public void makeStartSound() {
        System.out.println("Vroom mm...");
    }
}
