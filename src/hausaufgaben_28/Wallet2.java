package hausaufgaben_28;

public class Wallet2 {
    Money2 money2;

    public Wallet2(Money2 money2) {
        this.money2 = money2;
    }

    public Money2 getMoney() {
        return money2;
    }

    @Override
    public String toString() {
        return  "Wallet2: " + money2;
    }
}
