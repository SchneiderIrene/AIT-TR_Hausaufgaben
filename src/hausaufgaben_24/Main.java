package hausaufgaben_24;

public class Main {
    public static void main(String[] args) {
        Pets pets = new Pets("Pet");
        pets.eat();
        pets.slip();

        System.out.println("-----------------------------------");

        Dog dog = new Dog("Dog", "Sharik");
        dog.eat();
        dog.slip();
        dog.sout();
        dog.walk();

        System.out.println("-----------------------------------");

        Cat cat = new Cat("Cat", "Murka");
        cat.eat();
        cat.slip();
        cat.sout();
        cat.walk();

        System.out.println("-----------------------------------");

        Pets dog1 = new Dog("Dog", "Tuzik");
        dog1.slip();
        dog1.eat();
        dog1.sout();

        System.out.println("-----------------------------------");

        Pets cat1 = new Cat("Cat", "Vaska");
        cat1.eat();
        cat1.slip();
        cat1.sout();


    }
}
