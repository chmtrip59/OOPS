package in.kgcoding.polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car(0);

//        Vehicle v = new Vehicle();
        Plane p = new Plane();

      //Example for constructor / method overriding
        c.start();
        p.start();
//        castTest(v);
//        castTest(c);
//        castTest(p);
//        Vehicle vCar = new Car();//Because Car is a child of Vehicle

//        Car cVehi = new Vehicle();//child cannot make this object with parent
//          Car cVehi = (Car) new Vehicle();//Here we can typecast it

//        Object ref = new Car();//Object class is parent of all classes
//        Object ref1 = new Vehicle();

    }
    private static void castTest(Vehicle veh){
//    veh.start();
    Car cVeh = (Car) veh;
    ((Car) veh).noOfDoors();
    cVeh.start();
    }


}
