package hausaufgaben_31;

public class Rectangle implements Shape{
   private int height;
    private int weight;

    public Rectangle(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double area() {
        return height*weight;
    }

    @Override
    public double perimeter() {
        return height+weight;
    }
}
