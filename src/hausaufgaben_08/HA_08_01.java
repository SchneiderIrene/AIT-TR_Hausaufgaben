package hausaufgaben_08;

public class HA_08_01 {
    public static void main(String[] args) {
        System.out.println(area(12));

        double rad = 12;
        int res = (int)areaS(rad);
        System.out.println(res);
    }
    static int area (int r) {

        return (int)Math.PI*(r*r);
    }

    static double areaS (double r) {

        return Math.round(Math.PI*(r*r));
    }
}
