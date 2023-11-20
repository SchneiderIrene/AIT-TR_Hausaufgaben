package hausaufgaben_09;

import java.util.Scanner;

public class HA_09_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter UPPER or low letter");
        char letter = scanner.next().toLowerCase().charAt(0);
        int letterInt =  letter;
        scanner.close();
        System.out.printf("%c %s" , letter, letterCase(letter));
    }

    static String letterCase (int letterInt) {

        String s = "";
        if (letterInt>=97 && letterInt<=122){
            switch (letterInt) {
                case 97, 101, 105, 111, 117, 121:
                    s = " is a vowel";
                    break;
                default:
                    s = " is a consonant";
            }
        }
        else  {
            s = " the symbol is not a letter";
        }
        return s;
    }



}
