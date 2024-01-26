package hausaufgaben_46;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class HA_46_01 {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("John");
        list.add("John");
        list.add("John");
        list.add("Jack");
        list.add("Jack");
        list.add("Jack");
        list.add("Ann");
        list.add("Ann");
        list.add("Kate");
        list.add("Kate");
        list.add("Kate");

        System.out.println(list);
        System.out.println("--------------------------------");
        printList(list);


    }

    //Написать метод, принимающий лист имен, в котором некоторые имена
    // повторяются и печатающий имена из листа без печати повторений. При решении использовать Stream API

    public static void printList(List<String>list){
        list.stream().distinct().forEach(System.out::println);
    }

    public static List<String> printList2(List<String>list){

       return list.stream().distinct().collect(Collectors.toList());
    }

    public static List<String> printList3(List<String>list){

        return list.stream().collect(Collectors.collectingAndThen(toSet(), ArrayList::new));
    }
}
