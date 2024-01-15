package hausaufgaben_38;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer>list2 = new ArrayList<>();
        list2.add(0);
        list2.add(2);
        list2.add(3);
        list2.add(0);

        System.out.println(yes_no(list1, list2));


    }
    public static List<String> yes_no(List<Integer> list1, List<Integer>list2){
        List<String> strings =  new ArrayList<>();
        for (int i = 0; i<list1.size(); i++){
            if(list1.get(i).equals(list2.get(i))){
                strings.add("yes");
            }
            else {
                strings.add("no");
            }
        }
        return strings;
    }
}
