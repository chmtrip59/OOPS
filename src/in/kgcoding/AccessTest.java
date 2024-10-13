package in.kgcoding;

public class AccessTest {

    public static void main(String[] args) {
        Car car = new Car();

        car.color = "Red";

        car.model = "Swift";
        car.costOfPurchase =4;
        System.out.println(car);
//        car.costOfPurchase = 256;

        Car newCar = new Car("Black","BMW",1,5000);

        System.out.println(newCar);
        // we can make default object because of same package class
        Default def = new Default();
    }
}
