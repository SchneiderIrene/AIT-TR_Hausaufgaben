package hausaufgaben_06;

import java.util.Scanner;

public class HA_06_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day");
        int day = scanner.nextInt();




        if (day>=1 && day<=31){
            System.out.println("Enter month");
        }
        else {
            System.out.println("Incorrect format");
        }
        int month = scanner.nextInt();


        if (month>=1 && month<13){
            System.out.println("Enter year");
        } else {
            System.out.println("Incorrect format");
        }
        int year = scanner.nextInt();

        if(year>=1900 && year<2024) {
            System.out.println("Your data is " + day + "." + month + "." + year);
        }
        else {
            System.out.println("Incorrect format");
        }
    }
}
