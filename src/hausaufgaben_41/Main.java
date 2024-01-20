package hausaufgaben_41;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<String>strings = new ArrayList<>();
        strings.add("John");
        strings.add("John");
        strings.add("Jack");
        strings.add("Jack");
        strings.add("Jack");
        strings.add("Ann");
        strings.add("Ann");
        strings.add("Ann");
        strings.add("Ann");
        strings.add("Kate");
        strings.add("Kate");
        strings.add("Kate");
        strings.add("Kate");
        strings.add("Kate");

        System.out.println(findNameOccurrence(strings, "Ann"));

    }



    public static int findNameOccurrence(List<String>list, String name){
        Map<String, Integer> map = new HashMap<>();

        for (String s: list){
            if (map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }
            else {
                map.put(s,1);
            }
        }
        return map.containsKey(name)?map.get(name):0;
    }


}
    //Задача на мапы: Дан список имен, в котором некоторые имена повторяются.
       // Написать метод, который по имени вернет количество вхождений этого имени в список.
       // т.е. метод принимает лист и имя и возвращает число, соответствующее количеству раз ,
       // которое это имя встречается в листе