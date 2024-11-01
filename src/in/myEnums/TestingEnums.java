package in.myEnums;

public class TestingEnums {

    public static void main(String[] args) {
         TrafficLight color = TrafficLight.RED;

         color = TrafficLight.GREEN;
//         Grade grade = Grade.D;

        System.out.println(color);

           Grade grade = Grade.valueOf("D");

        for (Grade value : Grade.values()) {
            System.out.println(value);
        }
    }
}
