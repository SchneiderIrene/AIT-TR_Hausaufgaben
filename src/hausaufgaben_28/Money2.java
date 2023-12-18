package hausaufgaben_28;

public class Money2 {
    String banknote;
    int denomination;

    public Money2(String banknote, int denomination) {
        this.banknote = banknote;
        this.denomination = denomination;
    }

    @Override
    public String toString() {
        return  denomination + banknote;
    }
}
