package hausaufgaben_12;

public class HA_12_02 {
    public static void main(String[] args) {
        triangle(8);
    }
    static void triangle(int n) {

        for (int i = 1; i<=n;i++){

            System.out.println();

            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
        }
    }
}





