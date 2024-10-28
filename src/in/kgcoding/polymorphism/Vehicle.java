package in.kgcoding.polymorphism;

public abstract class  Vehicle {
    private int noOfTyres;
    Vehicle(){
        this.noOfTyres =0;
    }

    Vehicle(int noOfTyres){
        this.noOfTyres =noOfTyres;
    }
    public int getNumberOfTyres(){
        return this.noOfTyres;
    }
//    public abstract void start();
 public void start(){
     System.out.println("Vehicle is starting");
 }
}
