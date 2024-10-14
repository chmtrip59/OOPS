package in.kgcoding.inheritance;

public class InheritanceTest {

    public static void main(String[] args) {
        

        Vehicle vehicle = new Vehicle();

        TwoWheeler twoWheeler = new TwoWheeler();

        vehicle.commute();

        twoWheeler.commute();

        MotorCycle motor = new MotorCycle();

        motor.commute();

        motor.balance();

        motor.start();


    }
}
