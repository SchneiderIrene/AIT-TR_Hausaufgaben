package hausaufgaben_28;

public class Money {
    String banknote;
    int denomination;

    public Money(String banknote, int denomination) {
        this.banknote = banknote;
        this.denomination = denomination;
    }

    @Override
    public String toString() {
        return   denomination + " " + banknote;
    }
}
