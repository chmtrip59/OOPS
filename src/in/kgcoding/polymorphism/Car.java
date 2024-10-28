package in.kgcoding.polymorphism;

public class Car extends Vehicle {
    public int noOfDoors() {
        return 5;
    }
   Car(int noOfTyres){
        super(noOfTyres);

   }

    @Override
    public void start() {
        System.out.println("Car is starting ");
    }


}
