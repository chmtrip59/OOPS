package in.knowledgegate;

import in.kgcoding.Car;

public class DefaultTest {
    public static void main(String[] args) {
        //Imported another class from another package
        Car car = new Car("Yellow","Desire",5,3000);
        //we can not access this costOfPurchase bcz we can not access default access modifier
//        car.costOfPurchase =8;

//       in.kgcoding.Default def
    }
}
