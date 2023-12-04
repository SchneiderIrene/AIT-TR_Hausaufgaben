package hausaufgaben_18;

public class Rectangle {
    int length;
    int width;

    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }

    public  int square (){
        int square = length*width;
        return square;
    }

    public  int perimeter (){
        int perimeter = length*2 + width*2;
        return perimeter;
    }
}
