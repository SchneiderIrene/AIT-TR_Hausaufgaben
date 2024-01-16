package hausaufgaben_39;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String>list = List.of("hhlll", "uuuooo", "kkkk");
        System.out.println(max_minLengthOfString(list)) ;
    }

    public  static String max_minLengthOfString (List<String>strings) {
        String maxS = strings.get(0);
        String minS = strings.get(0);

        for (String s : strings) {
            if (s.length() < minS.length()) {
                minS = s;
            }
            if (s.length() > maxS.length()) {
                maxS = s;
            }
        }
        return strings.indexOf(minS) < strings.indexOf(maxS) ? minS : maxS;
    }

    }