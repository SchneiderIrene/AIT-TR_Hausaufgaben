package hausaufgaben_46;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//Есть класс Address с полями String street и int houseNumber и
// класс Person с полями String name, int age, Address address.
// Используя Stream API написать метод, принимающий лист Person и печатающий адреса тех, кто старше 17 лет

        List<Person>personList = new ArrayList<>();
        personList.add(new Person("John", 25, new Address("Street", 1)));
        personList.add(new Person("Jack", 27, new Address("Street", 2)));
        personList.add(new Person("Ann", 16, new Address("Street", 3)));
        personList.add(new Person("Kate", 17, new Address("Street", 4)));
        personList.add(new Person("Bill", 37, new Address("Street", 5)));
        personList.add(new Person("Benn", 31, new Address("Street", 6)));

        System.out.println(personList);
        System.out.println("-----------------------");
        printAddress(personList);

    }

    public static void printAddress (List<Person>list){
        list.stream()
                .filter(a -> a.getAge()>17)
                .forEach(a -> System.out.println(a.getAddress()));
    }
}
