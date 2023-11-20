package hausaufgaben_09;

import java.util.Scanner;

public class HA_09_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter UPPER or low letter");
        char letter = scanner.next().toLowerCase().charAt(0);
//        System.out.println(letter + letterCase(letter));
        System.out.printf("%c %s" , letter, letterCase(letter));

    }

    static String letterCase (char letter) {
        String s = "";
        switch (letter) {
            case 'a','e','i','o','u','y':
                s = " is a vowel";
                break;
            case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','x','w','z':
                s = " is a consonant";
                break;
            default:
                s = " the symbol is not a letter";
        }

        return s;
    }



}
