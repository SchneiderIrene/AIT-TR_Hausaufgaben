package hausaufgaben_31;

public interface Shape {
    double area();
    double perimeter();

   static double genArea(Shape[] shapes){
        double genAr = 0;
        for (Shape shape : shapes) {
            genAr += shape.area();
        }
        return genAr;
    }


}
