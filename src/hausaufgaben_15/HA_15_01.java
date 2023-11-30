package hausaufgaben_15;

import java.util.Arrays;

public class HA_15_01 {
    public static void main(String[] args) {
        int []arr = {10,15,10,1,25,10};
        int n = 15;
        int m = 30;
        System.out.println("Summa elements " +  n + " array " +
                Arrays.toString(arr) + "  = " + m + "? " + sum10(arr, n, m));

    }
    public  static boolean sum10 (int []arr, int n, int m) {
        int sum = 0;
        for (int el : arr) {

            if (el == n) {
                sum += el;
            }
        }
        return sum == m;
    }
}
