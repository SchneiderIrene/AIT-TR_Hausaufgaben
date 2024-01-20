package hausaufgaben_42;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {
    //Написать метод, который принимает список имен и их анаграмм и имя,
    //по которому он возвращает список всех его анаграмм, включая само имя.
    //При решении использовать мапу.
    //Пример: [john, mary, ,jonh, bill, njoh, amry], john -> [john,jonh,njoh] (все буквы в словах маленькие)

    public static void main(String[] args) {

    }

    public static List<String> anagram(List <String>list, String name){
        Map <String, List<String>> map = new HashMap<>();
        for (String s: list){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

        }
    return list;
    }
}
