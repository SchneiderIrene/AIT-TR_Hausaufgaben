package hausaufgaben_31;

public class Main {
    public static void main(String[] args) {
        Shape circle1 = new Circle(3);
        Shape circle2 = new Circle(5);
        Shape rectangle1 = new Rectangle(10, 5);
        Shape rectangle2 = new Rectangle(11, 3);

        System.out.println("Area of circle1 is " + circle1.area());
        System.out.println("Perimeter of circle1 is " + circle1.perimeter());

        System.out.println("-----------------------------------------");

        System.out.println("Area of rectangle1 is " + rectangle1.area());
        System.out.println("Perimeter of rectangle1 is " + rectangle1.perimeter());

        System.out.println("-----------------------------------------");

        Shape[]shapes = {circle1, circle2, rectangle1, rectangle2};
        System.out.println("General area of all shapes is " + genArea(shapes));


    }
    static double genArea(Shape[] shapes){
        double genAr = 0;
        for (Shape shape : shapes) {
            genAr += shape.area();
        }
        return genAr;
    }



}
