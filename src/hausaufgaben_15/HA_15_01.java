package hausaufgaben_15;

import java.util.Arrays;

public class HA_15_01 {
    public static void main(String[] args) {
        int []arr = {10,15,10,1,25,10};
        System.out.println("Summa elements '10' array " + Arrays.toString(arr) + "  = 30? " + sum10(arr));


    }
    public  static boolean sum10 (int []arr) {
        int sum = 0;
        for (int el : arr) {

            if (el == 10) {
                sum += el;
            }
        }
        return sum == 30;
    }
}
