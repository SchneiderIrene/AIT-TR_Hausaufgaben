package hausaufgaben_44;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Printable printable = s -> System.out.println("!" + s +"!");
        printable.print("Java forever");

        Producable producable = () -> "Hello World";
        System.out.println(producable.produce());

        List<Person>personList = new ArrayList<>();
        personList.add(new Person("John", 35));
        personList.add(new Person("Ann", 30));
        personList.add(new Person("Bill", 29));
        personList.add(new Person("Kate", 34));
        personList.add(new Person("Jack", 25));
        personList.add(new Person("Fox", 36));
        personList.add(new Person("Bobby", 41));

        File file = new File("person.txt");

        writePerson(file, personList);
    }

    public static void writePerson (File file, List<Person> personList){

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        BufferedWriter bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(System.out))){
            for (Person person: personList){
                bufferedWriter.write(person.getName() + ": " + person.getAge());
                bufferedWriter1.write(person.getName() + ": " + person.getAge());
                bufferedWriter.newLine();
                bufferedWriter1.newLine();
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
