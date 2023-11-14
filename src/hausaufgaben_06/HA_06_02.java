package hausaufgaben_06;

public class HA_06_02 {
    public static void main(String[] args) {
        int a,b,c;
        a = 3;
        b = 1;
        c = 3;

       if (a==b & b==c & a==c){
           System.out.println("All numbers are equal");
       } else if (a==b | b==c | a==c) {
           System.out.println("Some numbers are equal");
       } else {
           System.out.println("All numbers are different");
       }


    }
}
