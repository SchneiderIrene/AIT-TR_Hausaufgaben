package hausaufgaben_42;

import java.util.*;

public class Anagram {
    //Написать метод, который принимает список имен и их анаграмм и имя,
    //по которому он возвращает список всех его анаграмм, включая само имя.
    //При решении использовать мапу.
    //Пример: [john, mary, ,jonh, bill, njoh, amry], john -> [john,jonh,njoh] (все буквы в словах маленькие)

    public static void main(String[] args) {
List<String>list = new ArrayList<>();
list.add("john");
list.add("nhoj");
list.add("hnoj");
list.add("hnjo");
list.add("ann");
list.add("bill");
list.add("benn");

        System.out.println(findAnagrams(list, "ljfth"));
    }

    public static List<String> findAnagrams(List <String>strings, String name){
        Map <String, List<String>> anagrams = new HashMap<>();

        for (String s: strings){
            String sortedKey = sortAnagram(s);
            if (anagrams.containsKey(sortedKey)) {
                List<String>value = anagrams.get(sortedKey);
                value.add(s);
                anagrams.put(sortedKey, value);
            }
            else {
                List<String>value = new ArrayList<>();
                value.add(s);
                anagrams.put(sortedKey, value);
            }

        }

    return anagrams.getOrDefault(sortAnagram(name), List.of());
    }

    private static String sortAnagram (String str){
        char[] chars =  str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
