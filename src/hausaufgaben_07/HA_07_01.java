package hausaufgaben_07;

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

//        if (b==0 && sign=="/"){
//            System.out.println("You can not divide by 0!!!");
//        }

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
                if(b==0){
                    System.out.println("You can not divide by 0!!!");
                } else {
                    System.out.println(a/b);
                }

                break;


            default:
                System.out.println("Incorrect arithmetic sign");
        }
    }
}
