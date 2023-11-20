package hausaufgaben_10;

public class HA_10_01 {
    public static void main(String[] args) {
        cube(15);
    }

    public static void  cube (int n) {
        int a = 1;
        int cube = 1;
        while (a<=n){
            System.out.println(a + " в кубе = " + (a*a*a));
            a++;
        }
    }
}
