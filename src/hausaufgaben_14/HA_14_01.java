package hausaufgaben_14;

public class HA_14_01 {
    public static void main(String[] args) {
    int arr [] = {1,2,8,7};
        System.out.println(sumElArr(arr));

    }

    public static int sumElArr (int arr []){
        int num = 0;
        for (int el: arr){
            if (el%2==0){
                num ++;
            }
        }
        return num;
    }
}
