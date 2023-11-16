package hausaufgaben_08;

public class HA_08_02 {
    public static void main(String[] args) {

        System.out.println(temperature(5));
    }
    static int temperature (int f) {
    int c = 5*(f-32)/9;
        return c;
    }
}
