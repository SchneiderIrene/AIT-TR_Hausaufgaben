package hausaufgaben_11;

public class HA_11_01 {
    public static void main(String[] args) {
        multi(15);
    }

    static void multi(int n) {
        int a = 0;
        while (a <= n) {
            System.out.println(a * n);
            a++;
        }
    }
}
