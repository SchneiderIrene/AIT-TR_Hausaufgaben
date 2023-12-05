package hausaufgaben_19;

public class Temperature {
    double f;


    public Temperature(double f) {
        this.f = f;
    }

    public  void convert (){
        System.out.printf("%.1f", 5*(f - 32)/9);
    }
}
