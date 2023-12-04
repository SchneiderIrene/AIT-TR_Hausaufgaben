package hausaufgaben_17;

public class HA_17_02 {
    public static void main(String[] args) {
        String str = "hello";
        int index = 2;
        System.out.println(removeCharAtIndex(str, index));
        System.out.println(removeCharAtIndex2(str, index));

    }

    //Написать метод, принимающий строку и целое число(индекс) и возвращающий строку без символа, находящегося по этому индексу.
    //
    //Пример:
    //int index = 3
    //String str = "Hello"
    //
    public static String removeCharAtIndex(String str, int index) {

        if (index >= str.length() || index<0){
            return "Such index does not exist";
        }
        char[] chars = str.toCharArray();
        String strRes = "";
        for (int i = 0; i < chars.length; i++) {
            if (i != index) {
                strRes += chars[i]; // str.substring(0, index) + str.substring(index + 1);
            }
        }
        return strRes;
    }

    public static String removeCharAtIndex2(String str, int index) {

        if (index >= str.length() || index<0){
            return "Such index does not exist";
        }
        return str.substring(0, index) + str.substring(index + 1);

    }
}

