package hausaufgaben_30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day of week");
        String s = scanner.nextLine().toUpperCase();

        System.out.println(isWeekend(s));

        scanner.close();


    }

    public static boolean isWeekend(String s){
        Week weekDay = Week.valueOf(s);
        System.out.println("Is " + s + " a weekend?");
       return weekDay == Week.SATURDAY || weekDay == Week.SUNDAY;
        }


    }

