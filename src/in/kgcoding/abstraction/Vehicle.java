package in.kgcoding.abstraction;

public abstract class Vehicle implements Transport{

    private int noOfTyres;


    @Override
    public void getSetGo() {
        System.out.println("Go into place");
    }


    public abstract void makeStartSound();

    public Vehicle(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public int getNoOfTyres() {
        return noOfTyres;
    }

    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public void commute(){
        System.out.println("Going...");
    }
}