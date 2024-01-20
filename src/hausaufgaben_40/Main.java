package hausaufgaben_40;

import java.util.HashMap;
import java.util.Map;

public class Main {
//    Дана Map<String, String> map, написать метод, который вернет Мап, такую, что если в исходной map есть
//    ключи ‘a’ и ‘b’, то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b.
//    Если нет, ничего не менять.
//    Примеры:
//    mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
//    mapAB({"a": "Hi"}) → {"a": "Hi"}
//    mapAB({"b": "There"}) → {"b": "There"}


    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "Hi");
        map1.put("b", "There");

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");

        Map<String, String> map3 = new HashMap<>();
        map3.put("b", "There");

        System.out.println(ab(map1));
        System.out.println(ab(map2));
        System.out.println(ab(map3));

    }

    public static Map<String, String> ab(Map<String, String> mapAB) {
        if (mapAB.containsKey("a") && mapAB.containsKey("b")) {
            mapAB.put("ab", mapAB.get("a").concat(mapAB.get("b")));
        }
        return mapAB;
    }
}
