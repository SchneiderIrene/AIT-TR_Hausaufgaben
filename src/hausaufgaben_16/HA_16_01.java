package hausaufgaben_16;

public class HA_16_01 {
    public static void main(String[] args) {
        String s = "Hello Java-World!!!";
        System.out.println(lenght2(s));

        String s1 = "Hello";
        String s2 = "There";
        System.out.println(concatUpper(s1, s2));

        String string = "abcd";
        System.out.println (endString(string));

    }

    public static int lenght2(String s) {
        return s.length() * 2;
    }

    public static String concatUpper(String s1, String s2) {
        return s1.concat(s2.substring(1)).toUpperCase().substring(1);
    }

    public static String endString(String string) {
        return string.substring(1).concat(string.substring(0, 1));
    }
}
