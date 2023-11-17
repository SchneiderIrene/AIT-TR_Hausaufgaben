package hausaufgaben_08;

public class HA_08_02 {
    public static void main(String[] args) {

        System.out.println(temperature(67));
        double res = temperature(67);
        System.out.printf("%.1f", res);

//        double a = 1.7777777;
//        System.out.printf("%.2f", a);
    }
    static double temperature (double f) {
    double c = 5*(f-32)/9;
        return c;
    }

}
