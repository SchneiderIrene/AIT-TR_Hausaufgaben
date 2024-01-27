package hausaufgaben_47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person>personList = new ArrayList<>();
        personList.add(new Person("John",35));
        personList.add(new Person("Jack",35));
        personList.add(new Person("Ann",17));
        personList.add(new Person("Kate",17));
        personList.add(new Person("Bill",17));
        personList.add(new Person("Benn",31));
        personList.add(new Person("Jorg",32));

        System.out.println(findListPersonByAge(personList));
        System.out.println(sumAge(personList));
        System.out.println(sumAge2(personList));
        System.out.println(namesOlder18(personList));

    }
    //Пусть есть класс Person с полями имя и возраст. Написать метод,
    // принимающий список Person и возвращающий мапу,
    // где возраст является ключом, а лист людей этого возраста значением

    //Есть тот же класс Person с полями String name, int age.
    //Написать метод,принимающий список Person и возвращающий суммарный возраст тех, кто старше 18 лет
    //Написать метод,принимающий список Person и возвращающий имена тех, кто старше 18 лет в виде такой строки:
    //       "At the moment John and Ann and Bill are of legal age "
    //      ( имена и текст могут быть любыми, по вашему выбору, структура предложения должна сохраняться)

    public static Map<Integer, List<Person>> findListPersonByAge (List<Person>personList){
        return personList.stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.toList()));
    }
public static int sumAge(List<Person>personList){

        return personList.stream()
                .filter(a -> a.getAge()>18)
                .mapToInt(Person::getAge)
                .sum();

}

    public static int sumAge2(List<Person>personList){

        return personList.stream()
                .map(Person::getAge)
                .filter(age -> age >18)
                .reduce(Integer::sum)
                .get();

    }

    public static String namesOlder18 (List<Person>personList){
        return personList.stream()
                .filter(a -> a.getAge()>18)
                .map(Person::getName)
                .collect(Collectors.joining(" and ","At the moment "," are of legal age."));
    }

}
