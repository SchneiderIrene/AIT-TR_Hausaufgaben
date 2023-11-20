package hausaufgaben_10;

import java.util.Scanner;

public class HA_10_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 5;
        int a = 0;
        int n = 5;
        int answer = 0;

        while (a<n){
            System.out.println("Guess a number between 0 and 9");
            answer = scanner.nextInt();
            a++;

            if (answer == secretNumber){
                System.out.println("You are right! You have guessed the secret number!");
                break;
            }
            else {
                System.out.print("Sorry, the number  ");
                if(answer<secretNumber){
                    System.out.println("is too small");
                }
                else {
                    System.out.println("is too big");
                }
            }
        }
        if (answer!=secretNumber){
            System.out.println("Sorry, you have no more try");
        }

    }
}
