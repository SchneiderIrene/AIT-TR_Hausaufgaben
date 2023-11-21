package hausaufgaben_10;

import java.util.Scanner;

public class HA_10_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 57;
        int attempts = 10;
        int answer = 0;

        while (attempts>0){
            System.out.println("Guess a number between 0 and 100");
            answer = scanner.nextInt();
            attempts--;

            if (answer == secretNumber){
                System.out.println("You are right! You have guessed the secret number!");
                return;
            }
            else {
                System.out.print("Sorry, the number  ");

                if(answer<secretNumber){
                    System.out.println("is too small.");
                }
                else {
                    System.out.println("is too big");
                }
                System.out.println("You have " + attempts + " try" );
            }

        }
//        if (answer!=secretNumber){
            System.out.println("Sorry, you have no more try");
//        }

    }
}
