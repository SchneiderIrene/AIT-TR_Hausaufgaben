package hausaufgaben_09;

import java.util.Scanner;

public class HA_09_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter UPPER or low letter");
        char letter = scanner.next().toLowerCase().charAt(0);
        System.out.println(letter + letterCase(letter));


    }

    static String letterCase (char letter) {
        String s = "";
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                s = " is a vowel";
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'x':
            case 'w':
            case 'z':
                s = " is a consonant";
                break;
            default:
                s = " the symbol is not a letter";
        }

        return s;
    }



}
