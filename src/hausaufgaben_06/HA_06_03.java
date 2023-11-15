package hausaufgaben_06;

import java.util.Scanner;

public class HA_06_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scanner.nextInt();




        boolean a = (year%4)==0;
        boolean b = (year%100)!=0;
        boolean c = (year%400==0) && (year%100==0);

        boolean result = a && (b || c);
//                (a && b) || (a && c);

        System.out.println("Is " + year + " a leap year? ");
        System.out.println(result);


//        if ((year%400==0)||(year%4==0)) {
//            System.out.println("Leap year");
//        } else if (year%100==0) {
//            System.out.println("Not leap year");
//        } else {
//            System.out.println("Not leap year");
        }


    }

