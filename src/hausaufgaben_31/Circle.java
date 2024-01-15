package hausaufgaben_31;

public class Circle implements Shape{
   private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public  double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }
}
