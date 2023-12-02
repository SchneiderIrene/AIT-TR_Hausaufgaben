package hausaufgaben_17;

public class HA_17_03 {
    public static void main(String[] args) {
        String string = "Hello";
        System.out.println(mySubstring(string, 1, 3));
    }


    public static String mySubstring(String string, int begin, int end) {
        char[] chars = string.toCharArray();
        String substr = "";
        for (int i = 0; i < chars.length; i++) {
            if (i >= begin && i < end) {
                substr += chars[i];
            }
        }
        return substr;
    }
}

/*
Написать свой собственный метод substring, работающий аналогично методу в Джаве.
 Метод принимает строку , индексы начала и конца и возвращает подстроку.
*/
