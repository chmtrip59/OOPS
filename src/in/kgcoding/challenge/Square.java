package in.kgcoding.challenge;

public class Square extends Shape{

    private final double sidesInCms;

    public Square(double sidesInCms) {
        this.sidesInCms = sidesInCms;
    }

    public double getSidesInCms() {
        return sidesInCms;
    }

    @Override
    public double calculateArea() {
        return (sidesInCms * sidesInCms);
    }
}
