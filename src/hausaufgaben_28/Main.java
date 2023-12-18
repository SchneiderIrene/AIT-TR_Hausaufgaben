package hausaufgaben_28;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Money money1 = new Money("Euro", 5);
        Money money2 = new Money("Euro", 10);
        Money money3 = new Money("Euro", 20);
        Money money4 = new Money("Euro", 50);
        Money money5 = new Money("Euro", 100);
        Money money6 = new Money("Euro", 200);
        Money money7 = new Money("Euro", 500);


        Money[] monies = {money1, money2, money3, money4, money5, money6, money7};
        System.out.println(Arrays.toString(monies));

        for (Money money : monies) {
            System.out.println(money);
        }


        System.out.println("--------------------------------");


        Money2 money2_1 = new Money2("$", 5);
        System.out.println(money2_1);
        Money2 money2_2 = new Money2("$", 10);
        System.out.println(money2_2);
        Money2 money2_3 = new Money2("$", 20);
        System.out.println(money2_3);
        Money2 money2_4 = new Money2("$", 50);
        System.out.println(money2_4);
        Money2 money2_5 = new Money2("$", 100);
        System.out.println(money2_5);
        Money2 money2_6 = new Money2("$", 200);
        System.out.println(money2_6);
        Money2 money2_7 = new Money2("$", 500);
        System.out.println(money2_7);

        System.out.println("--------------------------------");

        Wallet wallet1 = new Wallet(monies);
        System.out.println(wallet1);

        Wallet2 wallet2_1 = new Wallet2(money2_1);
        System.out.println(wallet2_1);
        Wallet2 wallet2_2 = new Wallet2(money2_2);
        System.out.println(wallet2_2);
        Wallet2 wallet2_3 = new Wallet2(money2_3);
        System.out.println(wallet2_3);
        Wallet2 wallet2_4 = new Wallet2(money2_4);
        System.out.println(wallet2_4);
        Wallet2 wallet2_5 = new Wallet2(money2_5);
        System.out.println(wallet2_5);
        Wallet2 wallet2_6 = new Wallet2(money2_6);
        System.out.println(wallet2_6);
        Wallet2 wallet2_7 = new Wallet2(money2_7);
        System.out.println(wallet2_7);


    }
}
