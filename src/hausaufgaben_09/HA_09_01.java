package hausaufgaben_09;

public class HA_09_01 {
    public static void main(String[] args) {

    int a = 77;
        System.out.println(a + numberTest(a));
    }

    static String numberTest (int a) {
        String s = "";
        if (a>0){
             s = " is a positive number";
        }
        if (a<0){
             s = " is a negative number";
        }
        if (a==0){
             s = " is zero";
        }
        return s;
    }
}
