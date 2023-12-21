package hausaufgaben_30;

import java.util.Scanner;

public class DayOfWeek {
    private static Scanner scanner = new Scanner(System.in);

    public void start() {
        do {
            Week day = reedOfWeek();
            System.out.println("It is " + isDayOff(day));

            System.out.println("Do you want to check another day? Enter 'yes' or any other letter if not ?");
        }
        while (scanner.nextLine().equalsIgnoreCase("yes"));
        System.out.println("Thank you");

        scanner.close();
    }

    private Week reedOfWeek() {
        System.out.println("Enter day of the week");
        String day = scanner.nextLine().toUpperCase();
        while (!(day.equals("MONDAY"))||
                (day.equals("TUESDAY"))||
                (day.equals("WEDNESDAY"))||
                (day.equals("THURSDAY"))||
                (day.equals("FRIDAY"))) {
            System.err.println("You have entered the wrong day. Please enter the correct day");
            day = scanner.nextLine().toUpperCase();
        }
        return Week.valueOf(day);
    }

    private boolean isDayOff(Week day) {
        switch (day) {
            case SUNDAY:
            case SATURDAY:
                return true;
            default:
                return false;
        }
    }
}
