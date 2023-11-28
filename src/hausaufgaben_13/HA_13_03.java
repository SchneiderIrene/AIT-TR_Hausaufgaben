package hausaufgaben_13;

public class HA_13_03 {
    public static void main(String[] args) {
        System.out.println(findMin(arr));
    }
    static int[]arr = {22,44,11,66,88,77,99};
    static int min = arr [0];
    public static int findMin(int[] ints){

        for (int i = 1; i < ints.length; i++){
            if(ints[i] < min) {
                min = ints[i];
            }
        }
    return min;
    }
}
