package in.kgcoding.polymorphism;

public class MethodOverloading {
    public int sum(int a,int b){
        return a+b;
    }
    public String sum(String a ,String b){
        return a+b;
    }
public int sum(int a, int b, int c, int d){
        return a+b+c+d;
}
    public static void main(String[] args) {
        MethodOverloading overload = new MethodOverloading();
//        int sum = overload.sum(3,4);
        overload.sum("Golu"," Tripathi");

//        System.out.println(overload.sum(5,sum));
//        System.out.println();
    }
}
