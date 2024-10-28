package in.kgcoding.nested;

public class Car {// we can make this class which is main class, only as public or default


    private int numberOfDoors;

    public  void repair(){
        Tyre t = new Tyre();
    }

    protected  class Tyre{//we can make this class public or private or protected or default




        private double width;

        private double pressure;

        private String material;

        public void inflate(){
            numberOfDoors = 4;
        }

    }
}
