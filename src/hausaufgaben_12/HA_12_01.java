package hausaufgaben_12;

import java.util.Scanner;

public class HA_12_01 {
    public static void main(String[] args) {
     multi();
    }
    static void multi (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int n = scanner.nextInt();

        int res = 0;
        for (int i = 1; i<=10; i++){
            res = i*n;
            System.out.println(i + " * " + n + " = " + res);
        }

    }
}
