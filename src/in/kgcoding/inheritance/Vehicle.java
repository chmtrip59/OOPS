package in.kgcoding.inheritance;

public class Vehicle {
    private int numberOfTyres;


    @Override
    public String toString() {
        return "Vehicle{" +
                "numberOfTyres=" + numberOfTyres +
                '}';
    }

    public void setNumberOfTyres(int numberOfTyres){
        this.numberOfTyres = numberOfTyres;
    }
    public void commute(){
        System.out.printf("I am going from place A to place B using %d tyres\n", numberOfTyres);


    }
}
