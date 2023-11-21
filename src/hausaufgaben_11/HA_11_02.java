package hausaufgaben_11;

public class HA_11_02 {
    public static void main(String[] args) {
        triangle(6);
    }

    static void triangle (int n){
        int counter = 1;
        while (counter<=n){
            System.out.println(counter);
            counter++;

            int counter2 = 1;
            while (counter2<counter) {
                System.out.print(counter2);
                counter2++;
            }
        }
        }



    }





