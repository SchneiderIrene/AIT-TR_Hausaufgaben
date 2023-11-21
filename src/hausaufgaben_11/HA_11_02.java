package hausaufgaben_11;

public class HA_11_02 {
    public static void main(String[] args) {
        triangle(10);
    }

    static void triangle(int n) {
        int counter = 1;
        while (counter <= n) {
            counter++;
            System.out.println();

            int counter2 = 1;
            while (counter2 < counter) {
                System.out.print(counter2);
                counter2++;
            }
        }

    }

}





