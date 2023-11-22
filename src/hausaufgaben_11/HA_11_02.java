package hausaufgaben_11;

public class HA_11_02 {
    public static void main(String[] args) {
        triangle(5);
        System.out.println();
        triangle2(5);
    }
    static void triangle(int n) {
        int counter = 1;
        while (counter <= n) {

            System.out.println();
            counter++;

            int counter2 = 1;
            while (counter2 < counter) {
                System.out.print(counter2);
                counter2++;
            }
        }
    }
    static void triangle2(int n) {
        int counter = 1;
        while (counter <= n) {


            int counter2 = 1;
            while (counter2 <= counter) {
                System.out.print(counter2);
                counter2++;
            }
             counter++;
               System.out.println();
        }
    }

}





