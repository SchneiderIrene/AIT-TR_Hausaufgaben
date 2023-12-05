package hausaufgaben_18;

public class Rectangle {
    int length;
    int width;

    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }

    public  int square (){
        return length*width;
    }

    public  int perimeter (){
        return length*2 + width*2;
    }
}
