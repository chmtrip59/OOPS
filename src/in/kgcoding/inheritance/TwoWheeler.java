package in.kgcoding.inheritance;

import in.kgcoding.inheritance.Vehicle;

public class TwoWheeler extends Vehicle {

    TwoWheeler() {
//        numberOfTyres = 2;
        setNumberOfTyres(2);//Using setter to set the number of tyres when vehicle has  private numberOftyres property
    }

    public void balance(){
        System.out.println("I am balancing on two tyres");
    }


}
