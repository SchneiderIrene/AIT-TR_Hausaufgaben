package hausaufgaben_04;

import java.util.Scanner;

public class HA_04_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your surname");
        String surname = scanner.nextLine();
        System.out.println("EInter your age");
        int age = scanner.nextInt();

        System.out.println("First name: " + name);
        System.out.println("Last name: " + surname);
        System.out.println("Age: " + age + " years old");

    }
}
