package hausaufgaben_28;

import java.util.Arrays;

public class Wallet {
    private Money[]monies;
    public Wallet(Money[]monies) {
    this.monies = monies;
    }

    @Override
    public String toString() {
        return "Wallet " + Arrays.toString(monies);
    }
}
