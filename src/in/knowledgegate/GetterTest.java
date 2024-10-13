package in.knowledgegate;

import in.gettersetter.Car;

public class GetterTest {
    public static void main(String[] args) {


        Car car = new Car(3, 8000, "Maruti", "Red");
        car.setColor("Magenta");
        System.out.printf("%s %s",car.getColor(),car.getModel());
    }
}
