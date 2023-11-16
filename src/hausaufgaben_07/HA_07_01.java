package hausaufgaben_07;

import java.util.Scanner;

public class HA_07_01 {
    public static void main(String[] args) {
        Scanner scannerD = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);

        System.out.println("Enter first number");
        double a = scannerD.nextDouble();

        System.out.println("Enter arithmetic sign");
        String sign = scannerS.nextLine();

        System.out.println("Enter second number");
        double b = scannerD.nextDouble();


        switch (sign){
            case "-":
                System.out.println(a + " " + sign + " " + b + " = " + (a-b));
                break;

            case "+":
                System.out.println(a + " " + sign + " " + b + " = " +(a+b));
                break;

            case "*":
                System.out.println(a + " " + sign + " " + b + " = " +(a*b));
                break;

            case "/":
                if(b==0){
                    System.out.println("You can not divide by 0!!!");
                } else {
                    System.out.println(a + " " + sign + " " + b + " = " +(a/b));
                }

                break;


            default:
                System.out.println("Incorrect arithmetic sign");
        }
    }
}
