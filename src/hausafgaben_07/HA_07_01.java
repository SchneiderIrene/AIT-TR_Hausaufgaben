package hausafgaben_07;

import java.util.Scanner;

public class HA_07_01 {
    public static void main(String[] args) {
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = scannerI.nextInt();

        System.out.println("Enter arithmetic sign");
        String sign = scannerS.nextLine();

        System.out.println("Enter second number");
        int b = scannerI.nextInt();

        switch (sign){
            case "-":
                System.out.println(a-b);
                break;

            case "+":
                System.out.println(a+b);
                break;

            case "*":
                System.out.println(a*b);
                break;

            case "/":
                System.out.println(a/b);
                break;

            case "%":
                System.out.println(a%b);
                break;

            default:
                System.out.println("Incorrect arithmetic sign");
        }
    }
}
